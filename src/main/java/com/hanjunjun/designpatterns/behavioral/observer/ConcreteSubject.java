package com.hanjunjun.designpatterns.behavioral.observer;

/**
 * 具体的被观察的主题
 */
public class ConcreteSubject extends Subject {
	/**
	 * 通知所有观察者
	 */
	@Override
	public void notifyObserver() {
		System.out.println("具体的被观察的主题发生改变,通知所有注册的观察者");
		System.out.println("------------------");
		for (Observer observer : observers) {
			observer.response();
		}
	}
}
