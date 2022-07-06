package com.hanjunjun.designpatterns.structural.bridge;

/**
 * 图形抽象类
 */
public abstract class Shape {
	/**
	 * 画颜色api
	 */
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	/**
	 * 根据传入的颜色画
	 */
	public abstract void draw();
}
