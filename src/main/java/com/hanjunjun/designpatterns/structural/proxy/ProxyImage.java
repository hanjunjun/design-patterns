package com.hanjunjun.designpatterns.structural.proxy;

/**
 * 代理
 */
public class ProxyImage implements Image {
	private String fileName;
	private RealImage realImage;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		// 如果被代理对象是null，就new一个目标对象
		if (realImage == null) {
			realImage = new RealImage(this.fileName);
		}
		// 拥有被代理对象的上下文
		// 调用被代理目标对象的方法
		realImage.display();
	}
}
