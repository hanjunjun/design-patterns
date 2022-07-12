package com.hanjunjun.designpatterns.j2ee.servicelocator;

/**
 * 服务定位器模式
 */
public class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		// service1和service2都是首次创建并缓存起来
		Service service = ServiceLocator.getService("service1");
		service.execute();
		service = ServiceLocator.getService("service2");
		service.execute();

		System.out.println("----------------------------------------");
		System.out.println("再次从服务定位器中获取service1和2");
		// 后续在使用service1和service2是走的缓存中取的
		service = ServiceLocator.getService("service1");
		service.execute();
		service = ServiceLocator.getService("service2");
		service.execute();
	}
}
