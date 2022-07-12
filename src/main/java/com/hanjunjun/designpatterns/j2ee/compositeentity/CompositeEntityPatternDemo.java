package com.hanjunjun.designpatterns.j2ee.compositeentity;

/**
 * 组合实体模式
 * 使用client来演示组合实体设计模式的用法
 */
public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
		Client client = new Client();
		System.out.println("设置数据：");
		System.out.println("client.setData(\"Test\", \"Data\");");
		client.setData("Test", "Data");
		System.out.println("打印数据：");
		client.printData();
		System.out.println("----------------------");
		System.out.println("设置数据：");
		System.out.println("client.setData(\"Second Test\", \"Data1\");");
		client.setData("Second Test", "Data1");
		System.out.println("打印数据：");
		client.printData();
	}
}
