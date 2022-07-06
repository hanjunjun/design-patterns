package com.hanjunjun.designpatterns.structural.facade;

/**
 * 矩形
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("画矩形");
	}
}
