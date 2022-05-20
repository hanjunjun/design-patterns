package com.hanjunjun.designpatterns.creational.prototype;

public class EnemyPlaneFactory {
	// 原文件
	private static EnemyPlane prototype = new EnemyPlane(200,new Bullet());

	// 复印件
	public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
		EnemyPlane clone = prototype.clone();
		clone.setX(x);
		return clone;
	}
}
