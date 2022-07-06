package com.hanjunjun.designpatterns.structural.decorator;

/**
 * 装饰器模式
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape shape = new Circle();
		System.out.println("原始的圆形对象：");
		shape.draw();

		System.out.println("-------------------------");
		System.out.println("红色的圆形装饰之后的对象：");
		ShapeDecorator redCircle = new RedShapeDecorator(shape);
		redCircle.draw();

		System.out.println("-------------------------");
		System.out.println("被多个装饰器嵌套包装之后的对象：");
		ShapeDecorator redCircle1 = new RedShapeDecorator(new RedShapeDecorator(new RedShapeDecorator(new Circle())));
		redCircle1.draw();
		System.out.println("总结：可以看到装饰器自定义方法setRedBorder()被调用了3次");
	}
}
