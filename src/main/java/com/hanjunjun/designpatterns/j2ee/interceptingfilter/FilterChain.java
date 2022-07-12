package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链
 */
@Data
public class FilterChain {
	/**
	 * 过滤器列表
	 */
	private List<Filter> filters = new ArrayList<>();
	/**
	 * 请求的目标
	 */
	private Target target;

	/**
	 * 添加过滤器
	 *
	 * @param filter
	 */
	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	/**
	 * 遍历过滤器，执行请求目标
	 *
	 * @param request
	 */
	public void execute(String request) {
		// 遍历过滤器执行
		for (Filter filter : filters) {
			filter.execute(request);
		}
		// 进入目标处理器处理请求
		target.execute(request);
	}
}
