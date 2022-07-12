package com.hanjunjun.designpatterns.j2ee.frontcontroller;

/**
 * 调度器
 */
public class Dispatcher {
	/**
	 * 视图
	 */
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}

	/**
	 * 根据请求调度渲染不同的视图
	 *
	 * @param request
	 */
	public void dispatch(String request) {
		if (request.equalsIgnoreCase("STUDENT")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}