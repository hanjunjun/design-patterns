package com.hanjunjun.designpatterns.behavioral.command;

/**
 * 股票买入或卖出命令包装类
 * 命令操作集合封装
 */
public class Stock {
	/**
	 * 股票名称
	 */
	private String name = "ABC";
	/**
	 * 股票数量
	 */
	private int quantity = 10;

	/**
	 * 买股票操作
	 */
	public void buy() {
		System.out.println("股票 [名称：" + name + "数量：" + quantity + "] 购买");
	}

	/**
	 * 卖股票操作
	 */
	public void sell() {
		System.out.println("股票 [名称：" + name + "数量：" + quantity + "] 出售");
	}
}
