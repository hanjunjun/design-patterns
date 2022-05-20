package com.hanjunjun.designpatterns.structural.bridge;

/**
 * 桥接模式，适合1个类存在2个独立的变化维度，且2个维度都需要进行扩展的情况
 * 比如圆形和画不同颜色的圆形，这两个变化就可以分开写代码
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		// 画红色的圆形
		Shape redCircle = new Circle(100, 100, 10, new Red());
		redCircle.draw();

		// 画绿色的圆形
		Shape greenCircle = new Circle(100, 100, 10, new Green());
		greenCircle.draw();

		// 画绿色的正方形
		Shape square=new Square(10,20,5,new Green());
		square.draw();
	}
}
