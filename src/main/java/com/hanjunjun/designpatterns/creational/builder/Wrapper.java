package com.hanjunjun.designpatterns.creational.builder;

/**
 * 纸包装
 */
public class Wrapper implements Packing{
	/**
	 * 包装（动词）
	 * @return
	 */
	@Override
	public String pack() {
		return "用纸包装";
	}
}
