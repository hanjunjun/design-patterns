package com.hanjunjun.designpatterns.behavioral.mediator;

public class MediatorPatternDemo {
	public static void main(String[] args) {
		Mediator mediator=new ConcreteMediator();
		Colleague colleagueA=new ColleagueA();
		Colleague colleagueB=new ColleagueB();
		Colleague colleagueC=new ColleagueC();
		mediator.register(colleagueA);
		mediator.register(colleagueB);
		mediator.register(colleagueC);
		colleagueA.send();
		System.out.println("-----------------------------------");
		colleagueB.send();
		System.out.println("-----------------------------------");
		colleagueC.send();
	}
}
