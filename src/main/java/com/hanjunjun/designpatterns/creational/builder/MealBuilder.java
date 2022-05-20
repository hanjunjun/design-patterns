package com.hanjunjun.designpatterns.creational.builder;

/**
 * 套餐建造者
 */
public class MealBuilder {
	/**
	 * 准备一个素食套餐
	 *
	 * @return
	 */
	public Meal prepareVegMeal() {
		// 生成一个空套餐
		Meal meal = new Meal();
		// 给套餐加一个素食汉堡
		meal.addItem(new VegBurger());
		// 添加一个可口可乐
		meal.addItem(new Coke());
		return meal;
	}

	/**
	 * 准备一个非素食套餐
	 *
	 * @return
	 */
	public Meal prepareNonVegMeal() {
		// 生成一个空套餐
		Meal meal = new Meal();
		// 添加一个鸡肉汉堡
		meal.addItem(new ChickenBurger());
		// 添加一个百事可乐
		meal.addItem(new Pepsi());
		return meal;
	}
}
