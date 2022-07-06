package com.hanjunjun.designpatterns.behavioral.template;

public class DepositHealthCode extends Deposit{
	@Override
	protected void registerHealthCode() {
		System.out.println("健康码登记");
		super.registerHealthCode();
	}
}
