package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 工厂生成器
 * 超级工厂，生成其他工厂的工厂
 */
public class FactoryProducer {
	/**
	 * 通过传递的类型获取工厂
	 *
	 * @param choice
	 * @return
	 */
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
