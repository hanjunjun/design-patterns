package com.hanjunjun.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 账本类-对象结构Object Structure[ˈstrʌktʃər]
 */
public class AccountBook {
	/**
	 * 账单列表
	 */
	private List<Bill> billList = new ArrayList<>();

	/**
	 * 添加账单
	 *
	 * @param bill 账单
	 */
	public void addBill(Bill bill) {
		billList.add(bill);
	}

	/**
	 * 提供一个方法给访问者查看账单
	 *
	 * @param visitor 访问者
	 */
	public void show(AccountBookVisitor visitor) {
		for (Bill bill : billList) {
			String type = bill.getClass().getSimpleName().equalsIgnoreCase("IncomeBill") ? "收入" : "支出";
			System.out.println(visitor.getClass().getSimpleName() + "查看" + type + "订单：" + bill.getItem() + ",金额：" + bill.getAmount());
			bill.accept(visitor);
		}
	}
}
