package com.hanjunjun.designpatterns.creational.singleton;

/**
 * 懒汉-静态内部类
 */
public class Sun5 {
	/**
	 * 内部类
	 * 初始化Sun5的时候并不会初始化SingletonHolder，只有当显示调用getInstance时才会初始化SingletonHolder
	 * SingletonHolder内部静态变量靠JVM来保证线程安全
	 */
	private static class SingletonHolder {
		private static final Sun5 INSTANCE = new Sun5();
	}

	private Sun5() {

	}

	public static final Sun5 getInstance() {
		// 只有主动调用getInstance才会加载SingletonHolder，实现懒加载
		// SingletonHolder内部的Sun5实例是静态的是jvm来保证线程安全的，不会存在多个线程同时初始化的情况
		return SingletonHolder.INSTANCE;
	}
}
