package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 单例无法被反射创建实例，其他几种单例都有漏洞可以被人使用反射去new实例
 */
public enum Sun6 {
	INSTANCE;
	private String test = "";

	public void whateverMethod() {
		test = "测试";
	}
}
