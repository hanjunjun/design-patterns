package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

/**
 * 拦截过滤器模式
 */
public class InterceptingFilterPatternDemo {
	public static void main(String[] args) {
		System.out.println("创建过滤器");
		// 过滤器管理器
		FilterManager filterManager = new FilterManager(new Target());
		// 添加认证过滤器
		System.out.println("添加权限过滤器");
		filterManager.setFilter(new AuthenticationFilter());
		// 添加日志过滤器
		System.out.println("添加日志过滤器");
		filterManager.setFilter(new DebugFilter());

		System.out.println("------------------------------------");
		// 客户端
		Client client = new Client();
		System.out.println("创建客户端");
		// 给客户端设置过滤器管理器
		System.out.println("设置过滤器");
		client.setFilterManager(filterManager);
		// 发送请求
		System.out.println("发起请求");
		client.sendRequest("Home");
	}
}
