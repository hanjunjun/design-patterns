package com.hanjunjun.designpatterns.creational.factory;

/**
 * 牧马人鼠标
 */
public class MuMaRen implements Mouse{
	@Override
	public void produce() {
		System.out.println("生产了一个牧马人鼠标");
	}
}
