package com.hanjunjun.designpatterns.j2ee.frontcontroller;

/**
 * 前端控制器模式
 */
public class FrontControllerPatternDemo {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("Home");
		System.out.println("----------------------------------");
		frontController.dispatchRequest("Student");
	}
}
