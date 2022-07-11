package com.hanjunjun.designpatterns.behavioral.template;

/**
 * 先进行健康码登记，再办理存款
 */
public class DepositHealthCode extends Deposit{
	@Override
	protected void registerHealthCode() {
		System.out.println("--健康码登记");
		super.registerHealthCode();
	}
}
