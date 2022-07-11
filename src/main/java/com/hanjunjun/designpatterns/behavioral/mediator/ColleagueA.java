package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 买家
 */
public class ColleagueA extends Colleague {
	@Override
	public void receive() {
		System.out.println("买家：现在就可以签合同");
	}

	@Override
	public void send() {
		System.out.println("买家：便宜10万我就买");
		// 请中介者转发请求
		System.out.println("中介代买家传达");
		mediator.relay(this);
	}
}
