package com.hanjunjun.designpatterns.behavioral.visitor;

/**
 * 收入-具体的被访问的元素
 * IncomeBill[ˈɪnkʌm]
 */
public class IncomeBill implements Bill {
	/**
	 * 金额
	 */
	private double amount;
	/**
	 * 项目
	 */
	private String item;

	public IncomeBill(double amount, String item) {
		this.amount = amount;
		this.item = item;
	}

	/**
	 * 接受
	 *
	 * @param visitor
	 */
	@Override
	public void accept(AccountBookVisitor visitor) {
		visitor.visit(this);
	}

	/**
	 * 获取金额
	 *
	 * @return
	 */
	@Override
	public double getAmount() {
		return amount;
	}

	/**
	 * 获取项目名称
	 *
	 * @return
	 */
	@Override
	public String getItem() {
		return item;
	}
}
