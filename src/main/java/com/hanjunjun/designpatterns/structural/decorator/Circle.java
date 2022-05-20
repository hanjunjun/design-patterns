package com.hanjunjun.designpatterns.structural.decorator;

public class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("shape:圆形");
	}
}
