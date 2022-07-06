package com.hanjunjun.designpatterns.behavioral.nullobject;

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
		return name;
	}
}
