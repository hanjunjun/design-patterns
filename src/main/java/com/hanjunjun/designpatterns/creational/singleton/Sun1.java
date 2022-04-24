package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 饿汉
 * 这种无论有没有人使用都会创建一个单例
 */
public class Sun1 {
	// jvm会类加载器会有锁去控制避免一个类被初始化多次
	// 静态的字段和代码块都是只会执行一次
	private static final Sun1 SUN = new Sun1();

	/**
	 * java没有C#那种静态的构造函数
	 * C#静态构造函数可以在类第一次加载的时候进入static Sun1去初始化，只会调用一次，类里面的静态变量也只会调用一次。
	 */
	public static void init() {

	}

	public static Sun1 getInstance() {
		return SUN;
	}
}
