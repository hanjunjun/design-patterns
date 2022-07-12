package com.hanjunjun.designpatterns.j2ee.servicelocator;

/**
 * 具体的服务
 */
public class Service1 implements Service {
	@Override
	public String getName() {
		return "Service1";
	}

	@Override
	public void execute() {
		System.out.println("执行服务1中...");
	}
}
