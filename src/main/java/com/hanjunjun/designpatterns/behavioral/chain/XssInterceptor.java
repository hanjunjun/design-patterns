package com.hanjunjun.designpatterns.behavioral.chain;

/**
 * xss拦截器
 */
public class XssInterceptor extends AbstractInterceptor {

	@Override
	protected boolean handle(Request request) {
		System.out.println("xss拦截验证：" + (request.getXssAdopt() ? "验证通过" : "验证失败"));
		return request.getXssAdopt();
	}
}
