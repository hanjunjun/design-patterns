package com.hanjunjun.designpatterns.behavioral.template;

/**
 * 取款
 */
public class WithdrawMoney extends AbstractTemplate {
	@Override
	void handleDesignatedBusiness() {
		System.out.println("--取款");
	}
}
