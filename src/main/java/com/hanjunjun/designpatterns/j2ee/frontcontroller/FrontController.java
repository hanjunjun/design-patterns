package com.hanjunjun.designpatterns.j2ee.frontcontroller;

public class FrontController {
	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	private boolean isAuthenticUser() {
		System.out.println("User is authenticated successfully");
		System.out.println("用户认证成功");
		return true;
	}

	private void trackRequest(String request) {
		System.out.println("记录请求：" + request);
	}

	public void dispatchRequest(String request) {
		// 记录每一个请求
		trackRequest(request);
		// 对用户进行身份验证
		if (isAuthenticUser()) {
			// 根据请求调度任务
			dispatcher.dispatch(request);
		}
	}
}
