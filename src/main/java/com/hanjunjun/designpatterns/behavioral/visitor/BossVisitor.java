package com.hanjunjun.designpatterns.behavioral.visitor;

/**
 * 老板类-具体访问者之一
 * 老板只关心一共收入多少支出多少，其余并不关心
 */
public class BossVisitor implements AccountBookVisitor {
	/**
	 * 总的收入金额
	 */
	private double totalIncome;
	/**
	 * 总的支出金额
	 */
	private double totalConsume;

	/**
	 * 查看支出账单
	 *
	 * @param bill
	 */
	@Override
	public void visit(ConsumeBill bill) {
		totalConsume += bill.getAmount();
	}

	/**
	 * 查看收入账单
	 *
	 * @param bill
	 */
	@Override
	public void visit(IncomeBill bill) {
		totalIncome += bill.getAmount();
	}

	public double getTotalIncome() {
		System.out.println("老板查看一共的收入多少，数目："+totalIncome);
		return totalIncome;
	}

	public double getTotalConsume() {
		System.out.println("老板查看一共的支出多少，数目："+totalConsume);
		return totalConsume;
	}
}
