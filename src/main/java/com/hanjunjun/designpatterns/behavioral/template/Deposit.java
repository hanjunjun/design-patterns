package com.hanjunjun.designpatterns.behavioral.template;

/**
 * 办理存款
 */
public class Deposit extends AbstractTemplate {

	@Override
	void handleDesignatedBusiness() {
		System.out.println("--办理存款");
	}
}
