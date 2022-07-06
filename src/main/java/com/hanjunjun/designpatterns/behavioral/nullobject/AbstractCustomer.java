package com.hanjunjun.designpatterns.behavioral.nullobject;

/**
 * 抽象消费者
 */
public abstract class AbstractCustomer {
	protected String name;

	public abstract boolean isNil();

	public abstract String getName();
}
