package com.hanjunjun.designpatterns.objectoriented.Polymorphism;

/**
 * 人类
 */
public class Human {
	public void eat(Food food) {
		System.out.println("我在吃" + food.getFoodName());
	}
}
