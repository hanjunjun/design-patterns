package com.hanjunjun.designpatterns.objectoriented.polymorphism;

/**
 * 食物
 */
public abstract class Food {
	private String foodName;
	public Food(){

	}
	public Food(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodName(){
		return foodName;
	}
}
