package com.hanjunjun.designpatterns.behavioral.visitor;

/**
 * 注册会计师类-具体访问者之一
 */
public class CpaVisitor implements AccountBookVisitor {

	/**
	 * 查看支出账单
	 * 注会在查看账本时，如果是支出，且支出是工资时，则需要查看是否交税了
	 *
	 * @param bill
	 */
	@Override
	public void visit(ConsumeBill bill) {
		if ("工资".equals(bill.getItem())) {
			System.out.println("注会查看工资是否交了个人所得税");
		}
	}

	/**
	 * 查看收入账单
	 * 如果是收入，则查看所有的收入是否交税
	 *
	 * @param bill
	 */
	@Override
	public void visit(IncomeBill bill) {
		System.out.println("注会查看收入是否交税");
	}
}
