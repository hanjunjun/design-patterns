package com.hanjunjun.designpatterns.behavioral.template;

/**
 * 办理取款
 */
public class WithdrawMoney extends AbstractTemplate {
	@Override
	void handleDesignatedBusiness() {
		System.out.println("--办理取款");
	}
}
