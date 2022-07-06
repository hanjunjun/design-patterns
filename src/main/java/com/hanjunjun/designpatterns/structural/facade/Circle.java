package com.hanjunjun.designpatterns.structural.facade;

/**
 * 圆形
 */
public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("画圆形");
	}
}
