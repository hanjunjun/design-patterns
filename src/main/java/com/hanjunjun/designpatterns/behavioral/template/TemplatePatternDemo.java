package com.hanjunjun.designpatterns.behavioral.template;

public class TemplatePatternDemo {
	public static void main(String[] args) {
		// 取款
		AbstractTemplate template = new Deposit();
		template.handleBusiness();
		System.out.println("----------------------------");
		// 取款前健康码登记
		template = new DepositHealthCode();
		template.handleBusiness();
		System.out.println("----------------------------");
		// 取款
		template = new WithdrawMoney();
		template.handleBusiness();
	}
}
