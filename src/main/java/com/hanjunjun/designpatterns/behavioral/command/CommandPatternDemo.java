package com.hanjunjun.designpatterns.behavioral.command;

/**
 * 命令发送者
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		// 命令集合
		Stock abcStock=new Stock();
		// 具体的命令
		Order buyStockOrder=new BuyStock(abcStock);
		Order sellStockOrder=new SellStock(abcStock);

		// 接受并执行命令
		Broker broker=new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		// 处理订单
		broker.placeOrders();
	}
}
