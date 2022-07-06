package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 绿色
 */
public class Green implements Color {
	@Override
	public void fill() {
		System.out.println("fill green");
	}
}
