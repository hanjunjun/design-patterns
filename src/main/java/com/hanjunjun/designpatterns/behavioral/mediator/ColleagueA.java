package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 买家
 */
public class ColleagueA extends Colleague{
	@Override
	public void receive() {
		System.out.println("买家收到请求");
	}

	@Override
	public void send() {
		System.out.println("买家发送请求");
		// 请中介者转发请求
		mediator.relay(this);
	}
}
