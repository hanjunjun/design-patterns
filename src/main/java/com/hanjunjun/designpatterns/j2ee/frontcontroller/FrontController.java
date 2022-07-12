package com.hanjunjun.designpatterns.j2ee.frontcontroller;

/**
 * 控制器
 */
public class FrontController {
	/**
	 * 调度器
	 */
	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	/**
	 * 请求认证
	 *
	 * @return
	 */
	private boolean isAuthenticUser() {
		System.out.println("用户认证成功");
		return true;
	}

	/**
	 * 请求记录
	 *
	 * @param request
	 */
	private void trackRequest(String request) {
		System.out.println("记录请求：" + request);
	}

	/**
	 * 请求调度
	 *
	 * @param request
	 */
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
