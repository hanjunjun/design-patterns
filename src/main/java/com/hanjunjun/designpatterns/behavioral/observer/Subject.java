package com.hanjunjun.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察的主题抽象接口
 */
abstract class Subject {
	/**
	 * 观察者列表
	 */
	protected List<Observer> observers = new ArrayList<>();

	/**
	 * 添加观察者
	 *
	 * @param observer
	 */
	public void add(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 删除观察者
	 *
	 * @param observer
	 */
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 通知所有观察者
	 */
	public abstract void notifyObserver();
}
