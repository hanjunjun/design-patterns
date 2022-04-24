package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 懒汉-双重锁检查
 */
public class Sun3 {
	// 实例对其他线程可见
	private volatile static Sun3 SUN;

	private Sun3() {

	}

	/**
	 * 比Sun4的同步方法好些
	 * @return
	 */
	public static Sun3 getInstance() {
		// 双重检查
		if (SUN == null) {
			synchronized (Sun3.class) {
				// 如果无日才造日
				if (SUN == null) {
					SUN = new Sun3();
				}
			}
		}
		return SUN;
	}
}
