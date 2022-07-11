package com.hanjunjun.designpatterns.behavioral.command;

/**
 * 出售股票命令
 * 具体使用哪种命令
 */
public class SellStock implements Order {
	/**
	 * 命令操作集合
	 */
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/**
	 * 出售股票
	 */
	@Override
	public void execute() {
		abcStock.sell();
	}
}
