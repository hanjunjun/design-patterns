package com.hanjunjun.designpatterns.behavioral.nullobject;

/**
 * 空对象
 */
public class NullCustomer extends AbstractCustomer {
	public NullCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
