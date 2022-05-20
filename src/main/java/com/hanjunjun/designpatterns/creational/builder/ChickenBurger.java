package com.hanjunjun.designpatterns.creational.builder;

/**
 * 套餐子项目-鸡肉汉堡
 */
public class ChickenBurger extends Burger{
	/**
	 * 汉堡名称
	 * @return
	 */
	@Override
	public String name() {
		return "鸡肉汉堡";
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public float price() {
		return 50.5f;
	}
}
