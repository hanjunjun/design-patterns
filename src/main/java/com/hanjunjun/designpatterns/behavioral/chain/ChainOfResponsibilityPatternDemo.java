package com.hanjunjun.designpatterns.behavioral.chain;

import com.alibaba.fastjson.JSONObject;

/**
 * 责任链模式
 * 简易版的拦截器
 */
public class ChainOfResponsibilityPatternDemo {
	public static void main(String[] args) {
		// 组装拦截器调用链
		AbstractInterceptor abstractInterceptor = getInterceptors();
		// 创建一个请求
		Request request = new Request();

		// xss验证失败
		System.out.println("------------------------------------------------------");
		request.setXssAdopt(false).setCsrfAdopt(true).setAuthorization(true).setUrl("/order/save");
		System.out.println("发送请求：" + JSONObject.toJSONString(request));
		abstractInterceptor.handleRequest(request);

		// csrf验证失败
		System.out.println("------------------------------------------------------");
		request.setXssAdopt(true).setCsrfAdopt(false).setAuthorization(true).setUrl("/order/update");
		System.out.println("发送请求：" + JSONObject.toJSONString(request));
		abstractInterceptor.handleRequest(request);

		// 会话验证失败
		System.out.println("------------------------------------------------------");
		request.setXssAdopt(true).setCsrfAdopt(true).setAuthorization(false).setUrl("/order/update");
		System.out.println("发送请求：" + JSONObject.toJSONString(request));
		abstractInterceptor.handleRequest(request);

		// 所有拦截器验证通过
		System.out.println("------------------------------------------------------");
		request.setXssAdopt(true).setCsrfAdopt(true).setAuthorization(true).setUrl("/order/update");
		System.out.println("发送请求：" + JSONObject.toJSONString(request));
		abstractInterceptor.handleRequest(request);

	}

	/**
	 * 组装拦截器调用链
	 *
	 * @return
	 */
	private static AbstractInterceptor getInterceptors() {
		// 大鱼
		AbstractInterceptor xssInterceptor = new XssInterceptor();
		// 中鱼
		AbstractInterceptor csrfInterceptor = new CsrfInterceptor();
		// 小鱼
		AbstractInterceptor authorizationInterceptor = new AuthorizationInterceptor();

		// 大鱼吃中鱼
		xssInterceptor.setNextInterceptor(csrfInterceptor);
		// 中鱼吃小鱼
		csrfInterceptor.setNextInterceptor(authorizationInterceptor);

		// 返回大鱼，拦截器是一个单向链表结构，第一个节点可以一直往下遍历出所有的节点
		return xssInterceptor;
	}
}
