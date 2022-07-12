package com.hanjunjun.designpatterns.j2ee.servicelocator;

/**
 * JNDI Context带有对要查找的服务的引用
 */
public class InitialContext {
	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("Service1")) {
			System.out.println("创建一个新的Service1对象");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("Service2")) {
			System.out.println("创建一个新的Service2对象");
			return new Service2();
		}
		return null;
	}
}
