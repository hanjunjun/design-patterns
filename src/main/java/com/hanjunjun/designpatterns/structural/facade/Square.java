package com.hanjunjun.designpatterns.structural.facade;

/**
 * 正方形
 */
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("画正方形");
	}
}
