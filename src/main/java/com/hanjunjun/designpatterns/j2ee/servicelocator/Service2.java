package com.hanjunjun.designpatterns.j2ee.servicelocator;

/**
 * 
 */
public class Service2 implements Service{
	@Override
	public String getName() {
		return "Service2";
	}

	@Override
	public void execute() {
		System.out.println("执行服务2中...");
	}
}
