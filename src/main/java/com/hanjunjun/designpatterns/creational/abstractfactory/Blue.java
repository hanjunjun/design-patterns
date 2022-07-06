package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 蓝色
 */
public class Blue implements Color {
	@Override
	public void fill() {
		System.out.println("fill blue");
	}
}
