package com.hanjunjun.designpatterns.creational.prototype;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 原型模式
 */
public class PrototypePatternDemo {
	@SneakyThrows
	public static void main(String[] args) {
		List<EnemyPlane> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			EnemyPlane instance = EnemyPlaneFactory.getInstance(new Random().nextInt(200));
			list.add(instance);
		}
		for(EnemyPlane item : list){
			System.out.println(item.getX());
			System.out.println("子弹"+item.getBullet().getSize());
		}
		System.out.println("ok");
	}
}
