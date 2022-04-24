package com.hanjunjun.designpatterns.creational.singleton;

public class Sun4 {
	private static Sun4 SUN;

	private Sun4() {

	}

	/**
	 * 方法加入同步锁
	 * 这种方法有个缺陷，如果有很多线程调用getInstance会造成都要排队，影响性能
	 * @return
	 */
	public static synchronized Sun4 getInstance() {
		// 双重检查
		if (SUN == null) {
			SUN = new Sun4();
		}
		return SUN;
	}
}
