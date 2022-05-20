package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 矩形
 */
public class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("draw 矩形");
	}
}
