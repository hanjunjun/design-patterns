package com.hanjunjun.designpatterns.behavioral.visitor;

/**
 * 单个单子的接口（相当于Element）
 * [bɪl]
 */
public interface Bill {
	/**
	 * 接收
	 *
	 * @param visitor
	 */
	void accept(AccountBookVisitor visitor);

	/**
	 * 获取订单名称
	 *
	 * @return
	 */
	String getItem();

	/**
	 * 获取金额
	 * @return
	 */
	double getAmount();
}