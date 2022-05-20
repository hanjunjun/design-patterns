package com.hanjunjun.designpatterns.structural.facade;

/**
 * 外观模式
 * 医院排队，挂号，就诊，缴费，取药流程比较复杂，搞一个接待员去帮病人去做这些事会简单很多
 * 预防低水平开发人员带来的风险
 */
public class FacadePatternDemo {
	public static void main(String[] args) {
		// 把一些复杂的方法包装起来提供一个客户端给开发者调用
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
