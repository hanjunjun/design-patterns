package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 正方形
 */
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("draw 正方形");
	}
}
