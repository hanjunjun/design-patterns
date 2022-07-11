package com.hanjunjun.designpatterns.behavioral.observer;

/**
 * 具体观察者2
 */
public class ConcreteObserver2 implements Observer {
	/**
	 * 观察者收到主题变更之后做出的响应
	 */
	@Override
	public void response() {
		System.out.println("具体观察者2作出反应！");
	}
}
