package com.hanjunjun.designpatterns.structural.facade;

/**
 * 外观类
 * 把多个对象封装到一个外观类里调用
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Rectangle();
	}

	/**
	 * 画圆形
	 */
	public void drawCircle() {
		circle.draw();
	}

	/**
	 * 画矩形
	 */
	public void drawRectangle() {
		rectangle.draw();
	}

	/**
	 * 画正方形
	 */
	public void drawSquare() {
		square.draw();
	}
}
