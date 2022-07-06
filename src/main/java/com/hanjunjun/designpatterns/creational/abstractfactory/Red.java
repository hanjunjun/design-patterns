package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 红色
 */
public class Red implements Color {
	@Override
	public void fill() {
		System.out.println("fill red");
	}
}
