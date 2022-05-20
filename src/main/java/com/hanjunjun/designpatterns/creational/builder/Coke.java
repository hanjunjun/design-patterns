package com.hanjunjun.designpatterns.creational.builder;

/**
 * 套餐子项目-可口可乐
 */
public class Coke extends ColdDrink{
	/**
	 * 可乐名称
	 * @return
	 */
	@Override
	public String name() {
		return "可口可乐";
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public float price() {
		return 30.0f;
	}
}
