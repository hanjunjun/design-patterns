package com.hanjunjun.designpatterns.structural.bridge;

/**
 * 给图形画红色
 */
public class Red implements DrawAPI {
	@Override
	public void drawCircle(String shapeName, int radius, int x, int y) {
		System.out.println("画" + shapeName + "[ color: 红色, radius: "
				+ radius + ", x: " + x + ", " + y + "]");
	}
}
