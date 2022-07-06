package com.hanjunjun.designpatterns.structural.bridge;

/**
 * 正方形
 */
public class Square extends Shape {
	private int x, y, radius;

	public Square(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/**
	 * 根据传入的颜色画图形
	 */
	@Override
	public void draw() {
		drawAPI.drawCircle("正方形", radius, x, y);
	}
}
