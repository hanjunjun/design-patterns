package com.hanjunjun.designpatterns.structural.bridge;

public class Green implements DrawAPI{
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("画图形[ color: 绿色, radius: "
				+ radius +", x: " +x+", "+ y +"]");
	}
}
