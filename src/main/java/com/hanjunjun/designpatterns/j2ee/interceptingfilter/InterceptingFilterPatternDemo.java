package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

public class InterceptingFilterPatternDemo {
	public static void main(String[] args) {
		// 过滤器管理器
		FilterManager filterManager=new FilterManager(new Target());
		// 添加认证过滤器
		filterManager.setFilter(new AuthenticationFilter());
		// 添加日志过滤器
		filterManager.setFilter(new DebugFilter());

		// 客户端
		Client client=new Client();
		// 给客户端设置过滤器管理器
		client.setFilterManager(filterManager);
		// 发送请求
		client.sendRequest("Home");
	}
}
