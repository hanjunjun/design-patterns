package com.hanjunjun.designpatterns.behavioral.nullobject;

/**
 * 空对象包装器抽象
 * 抽象消费者
 */
public abstract class AbstractCustomer {
	protected String name;

	/**
	 * 是否为空
	 *
	 * @return
	 */
	public abstract boolean isNil();

	/**
	 * 获取名称
	 *
	 * @return
	 */
	public abstract String getName();
}
