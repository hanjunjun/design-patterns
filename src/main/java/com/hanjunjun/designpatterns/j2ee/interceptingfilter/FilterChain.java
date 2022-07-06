package com.hanjunjun.designpatterns.j2ee.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 */
public class FilterChain {
	private List<Filter> filters = new ArrayList<>();
	private Target target;

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void execute(String request) {
		// 遍历过滤器执行
		for (Filter filter : filters) {
			filter.execute(request);
		}
		// 进入目标处理器处理请求
		target.execute(request);
	}

	public void setTarget(Target target){
		this.target=target;
	}
}
