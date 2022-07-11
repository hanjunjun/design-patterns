package com.hanjunjun.designpatterns.behavioral.observer;

/**
 * 观察者模式
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		// 创建一个被观察的主题
		ConcreteSubject concreteSubject = new ConcreteSubject();
		System.out.println("创建一个被观察的主题");
		// 添加观察者1
		concreteSubject.add(new ConcreteObserver1());
		// 添加观察者2
		concreteSubject.add(new ConcreteObserver2());
		// 当被观察的主题发生了变更，通知所有观察者
		concreteSubject.notifyObserver();
	}
}
