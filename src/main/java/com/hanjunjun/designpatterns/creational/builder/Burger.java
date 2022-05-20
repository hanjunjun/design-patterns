package com.hanjunjun.designpatterns.creational.builder;

/**
 * 套餐子项目-汉堡抽象基类
 */
public abstract class Burger implements Item{
	/**
	 * 包装
	 * @return
	 */
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public abstract float price();
}
