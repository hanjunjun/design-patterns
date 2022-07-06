package com.hanjunjun.designpatterns.creational.factory;

/**
 * 鼠标工厂
 */
public class MouseFactory {
	/**
	 * 生成基于指定信息的鼠标实体类对象
	 *
	 * @param mouseType 鼠标品牌
	 * @return 具体的鼠标实现类
	 */
	public Mouse getMouse(String mouseType) {
		if (mouseType == null) {
			return null;
		}
		// 此处可以优化成反射创建实例对象，可以不用写if,else
		if (mouseType.equalsIgnoreCase("XiaoMi")) {
			return new XiaoMi();
		} else if (mouseType.equalsIgnoreCase("MuMaRen")) {
			return new MuMaRen();
		} else if (mouseType.equalsIgnoreCase("ShuangFeiYan")) {
			return new ShuangFeiYan();
		}
		return null;
	}
}