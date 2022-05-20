package com.hanjunjun.designpatterns.creational.builder;

/**
 * 套餐子项目-素食汉堡
 */
public class VegBurger extends Burger{
	/**
	 * 汉堡名称
	 * @return
	 */
	@Override
	public String name() {
		return "素食汉堡";
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public float price() {
		return 25.0f;
	}
}
