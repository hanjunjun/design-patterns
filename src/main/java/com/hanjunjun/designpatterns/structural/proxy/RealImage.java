package com.hanjunjun.designpatterns.structural.proxy;

/**
 * 目标对象，被代理对象
 */
public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(this.fileName);
	}

	@Override
	public void display() {
		System.out.println("展示：" + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("加载文件：" + fileName);
	}
}
