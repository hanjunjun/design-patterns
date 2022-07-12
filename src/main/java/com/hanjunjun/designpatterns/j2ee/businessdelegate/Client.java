package com.hanjunjun.designpatterns.j2ee.businessdelegate;

/**
 * 客户端
 */
public class Client {
	/**
	 * 业务代表
	 */
	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	/**
	 * 调用业务代表执行服务
	 */
	public void doTask() {
		this.businessDelegate.doTask();
	}
}