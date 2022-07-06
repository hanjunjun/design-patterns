package com.hanjunjun.designpatterns.structural.bridge;

/**
 * 给图形画绿色
 */
public class Green implements DrawAPI {
	@Override
	public void drawCircle(String shapeName, int radius, int x, int y) {
		System.out.println("画" + shapeName + "[ color: 绿色, radius: "
				+ radius + ", x: " + x + ", " + y + "]");
	}
}
