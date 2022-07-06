package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

public class Target {
	public void execute(String request) {
		System.out.println("执行请求：" + request);
	}
}
