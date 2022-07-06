package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 懒汉-双重锁检查
 */
public class Sun4 {
	// 实例对其他线程可见
	private volatile static Sun4 SUN;

	private Sun4() {

	}

	/**
	 * 比Sun4的同步方法好些
	 *
	 * @return
	 */
	public static Sun4 getInstance() {
		// 双重检查
		if (SUN == null) {
			synchronized (Sun4.class) {
				// 如果无日才造日
				if (SUN == null) {
					SUN = new Sun4();
				}
			}
		}
		return SUN;
	}
}
