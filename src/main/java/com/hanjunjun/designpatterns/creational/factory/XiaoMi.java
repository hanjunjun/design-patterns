package com.hanjunjun.designpatterns.creational.factory;

/**
 * 小米鼠标
 */
public class XiaoMi implements Mouse{
	@Override
	public void produce() {
		System.out.println("生产了一个小米鼠标");
	}
}
