package com.hanjunjun.designpatterns.behavioral.observer;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		// 添加观察者1
		concreteSubject.add(new ConcreteObserver1());
		// 添加观察者2
		concreteSubject.add(new ConcreteObserver2());
		// 被观察的对象发生了变更，通知所有观察者
		concreteSubject.notifyObserver();
	}
}
