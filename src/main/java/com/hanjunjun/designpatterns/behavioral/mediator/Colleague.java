package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 中介的客户抽象类
 */
public abstract class Colleague {
	/**
	 * 中介者
	 */
	protected Mediator mediator;

	/**
	 * 给客户对象一个属性用来存放中介对象
	 * 一方可以通过中介对象告知另一方（房产交易中的买卖双方）
	 *
	 * @param mediator
	 */
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 接收其他客户的消息
	 */
	public abstract void receive();

	/**
	 * 发送消息给其他客户
	 */
	public abstract void send();
}
