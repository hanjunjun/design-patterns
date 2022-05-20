package com.hanjunjun.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐
 */
public class Meal {
	/**
	 * 套餐项目列表
	 */
	private List<Item> items = new ArrayList<>();

	/**
	 * 给套餐添加项目
	 * @param item
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/**
	 * 计算套餐的总价格
	 * @return
	 */
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	/**
	 * 展示所有的套餐子项目
	 */
	public void showItems(){
		for (Item item :items){
			System.out.println("Item:"+item.name());
			System.out.println("Packing:"+item.packing().pack());
			System.out.println("Price:"+item.price());
		}
	}
}
