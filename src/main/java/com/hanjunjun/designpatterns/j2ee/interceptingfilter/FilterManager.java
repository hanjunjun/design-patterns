package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

/**
 * 过滤器管理器
 */
public class FilterManager {
	/**
	 * 过滤器链
	 */
	FilterChain filterChain;

	public FilterManager(Target target) {
		this.filterChain = new FilterChain();
		this.filterChain.setTarget(target);
	}

	/**
	 * 添加过滤器
	 * @param filter
	 */
	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	/**
	 * 过滤器请求
	 * @param request
	 */
	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}
