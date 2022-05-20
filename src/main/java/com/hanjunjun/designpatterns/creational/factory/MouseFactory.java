package com.hanjunjun.designpatterns.creational.factory;

public class MouseFactory {
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
