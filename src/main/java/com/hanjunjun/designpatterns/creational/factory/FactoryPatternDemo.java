package com.hanjunjun.designpatterns.creational.factory;

/**
 * 工厂模式
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		// 创建一个工厂
		MouseFactory mouseFactory = new MouseFactory();
		// 从工厂获取一个小米鼠标
		Mouse xiaoMi = mouseFactory.getMouse("XiaoMi");
		xiaoMi.produce();
		// 从工厂获取一个双飞燕鼠标
		Mouse shuangFeiYan = mouseFactory.getMouse("ShuangFeiYan");
		shuangFeiYan.produce();
		// 从工厂获取一个牧马人鼠标
		Mouse muMaRen = mouseFactory.getMouse("MuMaRen");
		muMaRen.produce();
	}
}
