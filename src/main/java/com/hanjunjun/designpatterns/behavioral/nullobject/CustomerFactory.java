package com.hanjunjun.designpatterns.behavioral.nullobject;

public class CustomerFactory {
	public static final String[] names = {"张无忌", "张三丰", "铁木真", "曹操"};

	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer(name);
	}
}
