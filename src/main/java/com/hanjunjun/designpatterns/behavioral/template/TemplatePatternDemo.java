package com.hanjunjun.designpatterns.behavioral.template;

/**
 * 模板模式
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {
		// 办理存款
		AbstractTemplate template = new Deposit();
		System.out.println("办理存款业务：");
		template.handleBusiness();
		System.out.println("----------------------------");
		// 先进行健康码登记，再办理存款
		template = new DepositHealthCode();
		System.out.println("先进行健康码登记，再办理存款：");
		template.handleBusiness();
		System.out.println("----------------------------");
		// 办理取款
		template = new WithdrawMoney();
		System.out.println("办理取款业务：");
		template.handleBusiness();
	}
}
