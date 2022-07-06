package com.hanjunjun.designpatterns.structural.proxy;

/**
 * 代理模式
 * 有点类似java spring的AOP切面
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test.png");
		image.display();
		System.out.println("--------------------");
		System.out.println("在调用一次");
		System.out.println("--------------------");
		image.display();
	}
}
