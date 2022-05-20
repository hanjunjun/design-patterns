package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 抽象中介者
 */
public abstract class Mediator {
	/**
	 * 注册同事
	 * @param colleague
	 */
	public abstract void register(Colleague colleague);

	/**
	 * 给除colleague以外的所有同事发送消息
	 * @param colleague
	 */
	public abstract void relay(Colleague colleague);
}
