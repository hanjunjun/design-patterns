package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 圆形
 */
public class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("draw 圆形");
	}
}
