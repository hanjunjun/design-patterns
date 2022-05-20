package com.hanjunjun.designpatterns.creational.builder;

/**
 * 套餐子项目-百事可乐
 */
public class Pepsi extends ColdDrink{
	/**
	 * 可乐名称
	 * @return
	 */
	@Override
	public String name() {
		return "百事可乐";
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public float price() {
		return 0;
	}
}
