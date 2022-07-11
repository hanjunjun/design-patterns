package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 卖家
 */
public class ColleagueB extends Colleague{
	@Override
	public void receive() {
		System.out.println("卖家：好的，没有问题");
	}

	@Override
	public void send() {
		System.out.println("卖家：啥时候签合同");
		// 请中介者转发请求
		System.out.println("中介代卖家家传达");
		mediator.relay(this);
	}
}
