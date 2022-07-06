package com.hanjunjun.designpatterns.j2ee.servicelocator;

public class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		// service1和service2都是首次创建并缓存起来
		Service service = ServiceLocator.getService("service1");
		service.execute();
		service = ServiceLocator.getService("service2");
		service.execute();

		// 后续在使用service1和service2是走的缓存中取的
		service = ServiceLocator.getService("service1");
		service.execute();
		service = ServiceLocator.getService("service2");
		service.execute();
	}
}
