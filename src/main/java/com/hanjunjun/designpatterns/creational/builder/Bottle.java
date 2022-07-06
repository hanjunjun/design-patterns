package com.hanjunjun.designpatterns.creational.builder;

/**
 * 瓶装
 */
public class Bottle implements Packing {
	/**
	 * 包装（动词）
	 *
	 * @return
	 */
	@Override
	public String pack() {
		return "用瓶子包装";
	}
}
