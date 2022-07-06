package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 卖家
 */
public class ColleagueB extends Colleague{
	@Override
	public void receive() {
		System.out.println("卖家收到请求");
	}

	@Override
	public void send() {
		System.out.println("卖家发送请求");
		// 请中介者转发请求
		mediator.relay(this);
	}
}
