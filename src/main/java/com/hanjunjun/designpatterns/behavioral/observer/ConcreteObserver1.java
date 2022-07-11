package com.hanjunjun.designpatterns.behavioral.observer;

/**
 * 具体观察者1
 */
public class ConcreteObserver1 implements Observer{
	/**
	 * 观察者收到主题变更之后做出的响应
	 */
	@Override
	public void response() {
		System.out.println("具体观察者1作出反应！");
	}
}
