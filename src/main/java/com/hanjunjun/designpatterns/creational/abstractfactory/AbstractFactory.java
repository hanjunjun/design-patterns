package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 颜色和图形工厂的抽象
 */
public abstract class AbstractFactory {
	/**
	 * 获取颜色具体实现
	 *
	 * @param color
	 * @return
	 */
	public abstract Color getColor(String color);

	/**
	 * 获取图形具体实现
	 *
	 * @param shape
	 * @return
	 */
	public abstract Shape getShape(String shape);
}
