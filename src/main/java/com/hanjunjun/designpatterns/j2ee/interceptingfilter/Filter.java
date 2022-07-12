package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

/**
 * 过滤器接口
 */
public interface Filter {
	/**
	 * 执行过滤器
	 *
	 * @param request
	 */
	void execute(String request);
}
