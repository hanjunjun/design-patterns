package com.hanjunjun.designpatterns.behavioral.mediator;

/**
 * 中介者模式
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		// 定义一个中介
		Mediator mediator = new ConcreteMediator();
		// 买家
		Colleague colleagueA = new ColleagueA();
		// 卖家
		Colleague colleagueB = new ColleagueB();
		// 把买家注册进来
		mediator.register(colleagueA);
		// 把卖家注册进来
		mediator.register(colleagueB);
		colleagueA.send();
		System.out.println("-----------------------------------");
		colleagueB.send();
	}
}
