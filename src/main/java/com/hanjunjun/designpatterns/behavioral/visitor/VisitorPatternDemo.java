package com.hanjunjun.designpatterns.behavioral.visitor;

/**
 * 访问者模式
 * 数据结构和数据操作者解耦
 * 数据结构尽量不变化，数据操作可以随便变化
 * 本例子是账单数据结构不变，注会和老板2个访问者他们俩的关注点不一样
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {
		// 账本
		AccountBook accountBook = new AccountBook();
		// 给账本添加收入账单
		accountBook.addBill(new IncomeBill(1000, "卖商品"));
		accountBook.addBill(new IncomeBill(1000, "卖广告位"));
		// 给账本添加支出账单
		accountBook.addBill(new ConsumeBill(20000, "工资"));
		accountBook.addBill(new ConsumeBill(1000, "材料费"));
		// 创建访问者
		// 创建一个老板访问者
		AccountBookVisitor boss = new BossVisitor();
		// 创建一个注会访问者
		AccountBookVisitor cpa = new CpaVisitor();
		// 老板访问账本
		accountBook.show(boss);
		// cpa注会访问账本
		accountBook.show(cpa);

		// 打印老板想知道的收入支出总金额
		((BossVisitor) boss).getTotalIncome();
		((BossVisitor) boss).getTotalConsume();
	}
}
