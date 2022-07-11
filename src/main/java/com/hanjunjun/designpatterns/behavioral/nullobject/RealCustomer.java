package com.hanjunjun.designpatterns.behavioral.nullobject;

/**
 * 真实的消费者
 */
public class RealCustomer extends AbstractCustomer {
	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
