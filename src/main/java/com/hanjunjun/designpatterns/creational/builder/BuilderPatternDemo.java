package com.hanjunjun.designpatterns.creational.builder;

/**
 * 建造者模式
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal meal = mealBuilder.prepareVegMeal();
		System.out.println("准备一个素食套餐");
		meal.showItems();
		System.out.println("素食套餐总费用：" + meal.getCost());

		System.out.println("--------------------------------------------");

		Meal meal1 = mealBuilder.prepareNonVegMeal();
		System.out.println("准备一个非素食套餐");
		meal1.showItems();
		System.out.println("非素食套餐总费用："+meal1.getCost());
	}
}
