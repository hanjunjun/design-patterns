package com.hanjunjun.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令的接收并处理
 */
public class Broker {
	private List<Order>orderList=new ArrayList<>();

	/**
	 * 接收命令
	 * @param order
	 */
	public void takeOrder(Order order){
		orderList.add(order);
	}

	/**
	 * 下订单
	 * 遍历命令并执行
	 */
	public void placeOrders(){
		for (Order order:orderList){
			order.execute();
		}
		orderList.clear();
	}
}
