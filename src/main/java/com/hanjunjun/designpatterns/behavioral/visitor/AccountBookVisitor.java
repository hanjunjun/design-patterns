package com.hanjunjun.designpatterns.behavioral.visitor;

/**
 * 账本访问者-抽象访问者
 */
public interface AccountBookVisitor {
	/**
	 * 查看支出账单
	 *
	 * @param bill
	 */
	void visit(ConsumeBill bill);

	/**
	 * 查看收入账单
	 *
	 * @param bill
	 */
	void visit(IncomeBill bill);
}
