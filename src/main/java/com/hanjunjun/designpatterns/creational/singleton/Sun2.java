package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 懒汉-无锁
 */
public class Sun2 {
	private static Sun2 SUN;

	private Sun2() {

	}

	public static Sun2 getInstance() {
		// 如果无日才造日
		if (SUN == null) {
			SUN = new Sun2();
		}
		return SUN;
	}
}
