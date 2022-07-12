package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

/**
 * 请求目标
 */
public class Target {
	public void execute(String request) {
		System.out.println("执行请求：" + request);
	}
}
