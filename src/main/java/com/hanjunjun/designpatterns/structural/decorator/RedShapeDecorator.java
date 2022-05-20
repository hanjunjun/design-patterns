package com.hanjunjun.designpatterns.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		this.shape.draw();
		setRedBorder(shape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("给圆形增加一个红色边框");
	}
}
