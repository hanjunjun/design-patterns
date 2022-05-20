package com.hanjunjun.designpatterns.structural.bridge;

public class Red implements DrawAPI{
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("画图形[ color: 红色, radius: "
				+ radius +", x: " +x+", "+ y +"]");
	}
}
