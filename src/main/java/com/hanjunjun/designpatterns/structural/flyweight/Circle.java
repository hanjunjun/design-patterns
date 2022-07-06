package com.hanjunjun.designpatterns.structural.flyweight;

import lombok.Data;

/**
 * 圆形
 */
@Data
public class Circle implements Shape {
	private String color;
	private int x;
	private int y;
	private int radius;

	public Circle(String color) {
		this.color = color;
		this.setX((int) (Math.random() * 100));
		this.setY((int) (Math.random() * 100));
		this.setRadius((int) (Math.random() * 100));
	}

	@Override
	public void draw() {
		System.out.println("圆形: Draw() [Color : " + color
				+ ", x : " + x + ", y :" + y + ", radius :" + radius);
	}
}
