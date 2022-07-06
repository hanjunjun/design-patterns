package com.hanjunjun.designpatterns.structural.decorator;

/**
 * 装饰类的具体实现
 */
public class RedShapeDecorator extends ShapeDecorator {
	/**
	 * 被装饰的类
	 *
	 * @param shape
	 */
	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	/**
	 * 被装饰的类的方法
	 */
	@Override
	public void draw() {
		// 执行到最里层的才是画圆形
		this.shape.draw();
		// 给draw方法增加装饰的方法
		setRedBorder(shape);
	}

	/**
	 * 给图形画边框
	 *
	 * @param decoratedShape
	 */
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("给圆形增加一个红色边框");
	}
}
