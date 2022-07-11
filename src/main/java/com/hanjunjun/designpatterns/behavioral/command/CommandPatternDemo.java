package com.hanjunjun.designpatterns.behavioral.command;

/**
 * 命令发送者
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		// 命令操作集合
		Stock abcStock = new Stock();
		// 具体的命令
		// 购买股票命令
		Order buyStockOrder = new BuyStock(abcStock);
		// 出售股票命令
		Order sellStockOrder = new SellStock(abcStock);

		// 定义一个命令管理类
		Broker broker = new Broker();
		// 添加购买股票命令到命令管理类
		broker.takeOrder(buyStockOrder);
		System.out.println("添加购买股票命令");
		// 添加出售股票命令到命令管理类
		broker.takeOrder(sellStockOrder);
		System.out.println("添加出售股票命令");

		// 处理订单
		System.out.println("处理命令操作");
		broker.placeOrders();
	}
}
