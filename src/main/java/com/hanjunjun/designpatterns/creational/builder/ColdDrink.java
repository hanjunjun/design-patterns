package com.hanjunjun.designpatterns.creational.builder;

/**
 * 套餐子项目-冰饮料
 */
public abstract class ColdDrink implements Item{

	/**
	 * 包装
	 * @return
	 */
	@Override
	public Packing packing() {
		return new Bottle();
	}

	/**
	 * 价格
	 * @return
	 */
	@Override
	public abstract float price();
}
