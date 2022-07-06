package com.hanjunjun.designpatterns.structural.decorator;

/**
 * 矩形
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("shape:矩形");
	}
}
