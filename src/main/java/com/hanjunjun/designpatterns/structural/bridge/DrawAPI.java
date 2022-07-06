package com.hanjunjun.designpatterns.structural.bridge;

/**
 * 画图API
 */
public interface DrawAPI {
	/**
	 * 画圆
	 *
	 * @param radius
	 * @param x
	 * @param y
	 */
	void drawCircle(String shapeName, int radius, int x, int y);
}
