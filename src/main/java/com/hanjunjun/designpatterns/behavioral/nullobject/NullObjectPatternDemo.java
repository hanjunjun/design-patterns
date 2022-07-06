package com.hanjunjun.designpatterns.behavioral.nullobject;

/**
 * 空对象模式
 */
public class NullObjectPatternDemo {
	public static void main(String[] args) {
		// 输入一个存在的名称
		AbstractCustomer customer1 = CustomerFactory.getCustomer("张无忌");
		System.out.println("【" + customer1.getName() + "】是否是空数据：" + customer1.isNil());

		// 输入一个不存在的名称
		AbstractCustomer customer2 = CustomerFactory.getCustomer("李四");
		System.out.println("【" + customer2.getName() + "】是否是空数据：" + customer2.isNil());
	}
}
