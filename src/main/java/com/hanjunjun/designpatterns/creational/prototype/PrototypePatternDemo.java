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
		// 深拷贝敌机列表
		List<EnemyPlane> deepList = new ArrayList<>();
		// 浅拷贝敌机列表
		List<EnemyPlane> shallowList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			deepList.add(EnemyPlaneFactory.cloneDeep(new Random().nextInt(200)));
			shallowList.add(EnemyPlaneFactory.cloneShallow(new Random().nextInt(200)));
		}
		System.out.println("【深拷贝】敌机信息：");
		for (EnemyPlane item : deepList) {
			System.out.println("敌机的X坐标：" + item.getX());
			System.out.println("子弹" + item.getBullet().getSize());
		}
		System.out.println("【深拷贝】结论：深拷贝不仅可以复制基本类型，还可以复制引用类型，深拷贝得到的子弹每一个都是独立的");
		System.out.println("------------------------------：");
		System.out.println("【浅拷贝】敌机信息：");
		for (EnemyPlane item : shallowList) {
			System.out.println("敌机的X坐标：" + item.getX());
			System.out.println("子弹" + item.getBullet().getSize());
		}
		System.out.println("【深拷贝】结论：浅拷贝只能拷贝基础类型，引用类型需要手动复制并更新引用，浅拷贝复制的每个引用类型实际上还是原件的引用类型的地址，所以得到的子弹都是同一个对象");
	}
}
