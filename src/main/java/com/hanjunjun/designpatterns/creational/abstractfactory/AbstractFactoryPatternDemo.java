package com.hanjunjun.designpatterns.creational.abstractfactory;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// 获取图形工厂
		System.out.println("从超级工厂中获取图形工厂");
		AbstractFactory shape = FactoryProducer.getFactory("shape");
		// 获取图形工厂里的"圆形产品"
		System.out.println("让图形工厂生产指定的图形实现类");
		Shape circle = shape.getShape("circle");
		// 画图
		circle.draw();

		// 获取图形工厂里的"矩形产品"
		Shape rectangle = shape.getShape("rectangle");
		rectangle.draw();

		// 获取正方形产品
		Shape square = shape.getShape("square");
		square.draw();

		System.out.println("------------------------------");
		// 获取颜色工厂
		System.out.println("从超级工厂中获取颜色工厂");
		AbstractFactory color = FactoryProducer.getFactory("color");
		// 从颜色工厂里获取产品"红色"
		System.out.println("让颜色工厂生产指定的颜色实现类");
		Color red = color.getColor("red");
		red.fill();

		// 从颜色工厂里获取产品"蓝色"
		Color blue = color.getColor("blue");
		blue.fill();

		// 从颜色工厂里获取产品"绿色"
		Color green = color.getColor("green");
		green.fill();
	}
}
