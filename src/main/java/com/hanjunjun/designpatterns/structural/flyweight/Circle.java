package com.hanjunjun.designpatterns.structural.flyweight;

public class Circle implements Shape{
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

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("圆形: Draw() [Color : " + color
				+", x : " + x +", y :" + y +", radius :" + radius);
	}
}
