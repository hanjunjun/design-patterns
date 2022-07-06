package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

/**
 * 请求日志过滤器
 */
public class DebugFilter implements Filter{
	@Override
	public void execute(String request) {
		System.out.println("请求日志："+request);
	}
}
