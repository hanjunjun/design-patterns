package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 抽象中介者
 */
public abstract class Mediator {
	/**
	 * 注册客户
	 * @param colleague
	 */
	public abstract void register(Colleague colleague);

	/**
	 * 给除自己以外的所有客户发送消息
	 * @param colleague
	 */
	public abstract void relay(Colleague colleague);
}
