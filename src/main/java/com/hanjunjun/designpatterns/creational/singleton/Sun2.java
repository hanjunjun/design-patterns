package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 懒汉-有锁
 */
public class Sun2 {
	private static Sun2 SUN;

	private Sun2() {
	}

	/**
	 * 方法加入同步锁
	 * 这种方法有个缺陷，如果有很多线程调用getInstance会造成都要排队，影响性能
	 *
	 * @return
	 */
	public static synchronized Sun2 getInstance() {
		// 双重检查
		if (SUN == null) {
			SUN = new Sun2();
		}
		return SUN;
	}
}
