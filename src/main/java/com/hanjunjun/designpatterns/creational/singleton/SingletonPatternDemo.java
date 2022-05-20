package com.hanjunjun.designpatterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例模式
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {
		ExecutorService executorService= Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			executorService.execute(()->{
				Sun1 sun1 = new Sun1();
			});
		}
		// 饿汉
		Sun1 sun1 = Sun1.getInstance();
		// 懒汉-无锁
		Sun2 sun2 = Sun2.getInstance();
		// 懒汉-双锁检查
		Sun3 sun3 = Sun3.getInstance();
	}
}
