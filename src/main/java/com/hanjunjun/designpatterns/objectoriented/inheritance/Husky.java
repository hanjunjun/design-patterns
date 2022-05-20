package com.hanjunjun.designpatterns.objectoriented.inheritance;

/**
 * 哈士奇-继承犬科类
 */
public class Husky extends Dog {
	public Husky() {
		// 初始化哈士奇的年龄，性别，品种，毛色
		super("哈士奇");
	}

	/**
	 * 拉雪橇-这是父类不具备的，其他狗也可以有自己特有的方法
	 * 继承的好处就是可以基于父类的基因灵活的扩展
	 */
	public void sleighRide() {
		System.out.println("拉雪橇");
	}
}
