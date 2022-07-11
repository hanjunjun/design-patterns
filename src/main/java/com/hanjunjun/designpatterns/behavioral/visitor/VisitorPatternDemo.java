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
		System.out.println("创建一个账本");
		// 给账本添加收入账单
		accountBook.addBill(new IncomeBill(1000, "卖商品"));
		System.out.println("添加收入：卖商品1000元");
		accountBook.addBill(new IncomeBill(1000, "卖广告位"));
		System.out.println("添加收入：卖广告1000元");
		// 给账本添加支出账单
		accountBook.addBill(new ConsumeBill(20000, "工资"));
		System.out.println("添加支出：工资20000");
		accountBook.addBill(new ConsumeBill(1000, "材料费"));
		System.out.println("添加支出：材料费1000");
		// 创建访问者
		// 创建一个老板访问者
		AccountBookVisitor boss = new BossVisitor();
		System.out.println("创建老板访问者");
		// 创建一个注会访问者
		AccountBookVisitor cpa = new CpaVisitor();
		System.out.println("创建注册会计师访问者");
		System.out.println("-----------------------------");

		// 老板访问账本
		System.out.println("老板访问者查看账单：");
		accountBook.show(boss);
		// 打印老板想知道的收入支出总金额
		((BossVisitor) boss).getTotalIncome();
		((BossVisitor) boss).getTotalConsume();
		System.out.println("-----------------------------");
		// cpa注会访问账本
		System.out.println("注册会计师访问者查看账单：");
		accountBook.show(cpa);
	}
}
