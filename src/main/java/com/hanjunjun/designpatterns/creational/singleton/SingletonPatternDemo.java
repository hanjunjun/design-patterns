package com.hanjunjun.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例模式
 */
public class SingletonPatternDemo {
	public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			executorService.execute(() -> {
				// Sun2 sun1 = new Sun2();
			});
		}
		// 饿汉
		Sun1 sun1 = Sun1.getInstance();
		// 懒汉-无锁
		Sun2 sun2 = Sun2.getInstance();
		Sun3 sun3 = Sun3.getInstance();
		// 懒汉-双锁检查
		Sun4 sun4 = Sun4.getInstance();
		Sun5 sun5 = Sun5.getInstance();
		Sun6 sun6 = Sun6.INSTANCE;

		// 双检锁单例内部定义成私有的也是可以被反射调用构造函数生成实例的，只有枚举才不能被创建实例
		// 也就是说除了枚举单例，其他单例创建方式都有漏洞，不过正常也没人会去反射创建单例吧。
		Class<?> clazzV2 = Class.forName(Sun4.class.getName());
		Constructor<?> constructor = clazzV2.getDeclaredConstructors()[0];
		constructor.setAccessible(true);
		Object o = constructor.newInstance();
	}
}
