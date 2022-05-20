package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 抽象同事类
 */
public abstract class Colleague {
	/**
	 * 中介者
	 */
	protected Mediator mediator;

	/**
	 * 设置中介者
	 * @param mediator
	 */
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 接收其他同事的消息
	 */
	public abstract void receive();

	/**
	 * 发送消息给其他同事
	 */
	public abstract void send();
}
