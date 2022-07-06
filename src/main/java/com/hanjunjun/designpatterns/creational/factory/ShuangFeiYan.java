package com.hanjunjun.designpatterns.creational.factory;

/**
 * 双飞燕鼠标
 */
public class ShuangFeiYan implements Mouse{
	@Override
	public void produce() {
		System.out.println("生产了一个双飞燕鼠标");
	}
}
