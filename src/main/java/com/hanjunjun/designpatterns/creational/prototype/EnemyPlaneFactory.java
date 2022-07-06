package com.hanjunjun.designpatterns.creational.prototype;

/**
 * 敌机生产工厂
 */
public class EnemyPlaneFactory {
	/**
	 * 原文件
	 */
	private static EnemyPlane prototype = new EnemyPlane(200, new Bullet());

	/**
	 * 复印件-深拷贝
	 *
	 * @param x
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public static EnemyPlane cloneDeep(int x) throws CloneNotSupportedException {
		// 复制一份原文件
		EnemyPlane clone = prototype.cloneDeep();
		clone.setX(x);
		return clone;
	}

	/**
	 * 复印件-浅拷贝
	 *
	 * @param x
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public static EnemyPlane cloneShallow(int x) throws CloneNotSupportedException {
		// 复制一份原文件
		EnemyPlane clone = prototype.cloneShallow();
		clone.setX(x);
		return clone;
	}
}