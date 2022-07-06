package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 懒汉-无锁
 */
public class Sun1 {
	private static Sun1 SUN;
	/**
	 * 私有化构造函数，不让外部调用者创建实例，只允许静态调用getInstance方法获取实例
	 */
	private Sun1() {
	}

	/**
	 * 获取实例
	 *
	 * @return
	 */
	public static Sun1 getInstance() {
		// 如果无日才造日
		if (SUN == null) {
			SUN = new Sun1();
		}
		return SUN;
	}
}
