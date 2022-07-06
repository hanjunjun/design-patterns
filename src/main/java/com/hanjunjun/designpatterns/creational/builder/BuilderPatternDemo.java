package com.hanjunjun.designpatterns.creational.builder;

/**
 * 建造者模式
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		// 创建一个套餐建造者
		MealBuilder mealBuilder = new MealBuilder();
		// 生成一个素食套餐
		Meal meal = mealBuilder.prepareVegMeal();
		System.out.println("准备一个素食套餐");
		// 展示套餐的内容
		System.out.println("打印套餐内容：");
		meal.showItems();
		System.out.println("素食套餐总费用：" + meal.getCost());

		System.out.println("--------------------------------------------");
		// 生成一个非素食套餐
		Meal meal1 = mealBuilder.prepareNonVegMeal();
		System.out.println("准备一个非素食套餐");
		// 展示套餐的内容
		System.out.println("打印套餐内容：");
		meal1.showItems();
		System.out.println("非素食套餐总费用：" + meal1.getCost());
	}
}
