package com.hanjunjun.designpatterns.j2ee.businessdelegate;

/**
 * 客户端
 */
public class Client {
	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	public void doTask(){
		this.businessDelegate.doTask();
	}
}
