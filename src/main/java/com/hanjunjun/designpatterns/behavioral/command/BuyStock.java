package com.hanjunjun.designpatterns.behavioral.command;

/**
 * 购买股票命令
 * 具体使用哪种命令
 */
public class BuyStock implements Order {
	/**
	 * 命令操作集合
	 */
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/**
	 * 购买股票
	 */
	@Override
	public void execute() {
		abcStock.buy();
	}
}
