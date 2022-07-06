package com.hanjunjun.designpatterns.structural.decorator;

/**
 * 装饰器抽象类
 */
public abstract class ShapeDecorator implements Shape {
	/**
	 * 被装饰的类
	 */
	protected Shape shape;

	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	/**
	 * 被装饰的方法
	 * 例：装饰A类，装饰器和A类都要实现同一个接口，装饰A类，需要把被装饰类A类的所有方法暴露出去，所有要用到接口约束强迫装饰类必须实现方法
	 */
	@Override
	public void draw() {
		this.shape.draw();
	}
}
