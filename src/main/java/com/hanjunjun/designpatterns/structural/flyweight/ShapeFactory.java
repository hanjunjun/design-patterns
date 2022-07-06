package com.hanjunjun.designpatterns.structural.flyweight;

import java.util.HashMap;

/**
 * 图形工厂
 */
public class ShapeFactory {
	// 如果是对象池的场景，最好使用堆栈，后进先出
	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		// 从对象池里面取对象
		Shape circle = circleMap.get(color);
		if (circle == null) {
			// 如果没有取到旧生成一个新的对象丢进对象池中
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("创建了一个新对象圆形，它的颜色是：" + color);
		}
		return circle;
	}
}
