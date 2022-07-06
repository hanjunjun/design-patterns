package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

/**
 * 请求鉴权过滤器
 */
public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("请求鉴权中：" + request);
	}
}
