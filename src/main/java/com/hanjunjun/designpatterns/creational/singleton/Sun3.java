package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 饿汉
 * 这种无论有没有人使用都会创建一个单例
 */
public class Sun3 {
	// 加了static之后，jvm会类加载器会有锁去控制避免多线程同时进入时一个类被初始化多次
	// 静态的字段和static代码块都是在jvm类加载器加载时初始化，并且无论什么情况下都只会执行一次，是天生的线程安全
	private static final Sun3 SUN = new Sun3();

	static {
		int a = 1;
	}

	private Sun3() {

	}

	public static Sun3 getInstance() {
		return SUN;
	}
}
