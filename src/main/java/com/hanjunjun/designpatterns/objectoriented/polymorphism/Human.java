package com.hanjunjun.designpatterns.objectoriented.polymorphism;

/**
 * 人类
 */
public class Human {
	public void eat(Food food) {
		System.out.println("我在吃" + food.getFoodName());
	}
}
