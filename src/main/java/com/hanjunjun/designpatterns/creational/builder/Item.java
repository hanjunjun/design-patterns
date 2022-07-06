package com.hanjunjun.designpatterns.creational.builder;

/**
 * 套餐项目接口
 */
public interface Item {
	/**
	 * 项目名称
	 *
	 * @return
	 */
	public String name();

	/**
	 * 项目包装方式
	 *
	 * @return
	 */
	public Packing packing();

	/**
	 * 项目价格
	 *
	 * @return
	 */
	public float price();
}
