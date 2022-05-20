package com.hanjunjun.designpatterns.behavioral.mediator;

public class ColleagueA extends Colleague{
	@Override
	public void receive() {
		System.out.println("同事A收到请求");
	}

	@Override
	public void send() {
		System.out.println("同事A发送请求");
		// 请中介者转发请求
		mediator.relay(this);
	}
}
