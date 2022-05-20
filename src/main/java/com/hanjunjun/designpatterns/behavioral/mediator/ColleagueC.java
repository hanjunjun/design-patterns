package com.hanjunjun.designpatterns.behavioral.mediator;

public class ColleagueC extends Colleague{
	@Override
	public void receive() {
		System.out.println("同事C收到请求");
	}

	@Override
	public void send() {
		System.out.println("同事C发送请求");
		mediator.relay(this);
	}
}
