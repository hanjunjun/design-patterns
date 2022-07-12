package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

/**
 * 客户端
 */
public class Client {
	FilterManager filterManager;

	/**
	 * 设置过滤器
	 *
	 * @param filterManager
	 */
	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	/**
	 * 发起请求
	 *
	 * @param request
	 */
	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
