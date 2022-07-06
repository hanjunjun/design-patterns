package com.hanjunjun.designpatterns.behavioral.chain;

import lombok.Data;

/**
 * 责任链抽象
 * 拦截器基类
 */
@Data
public abstract class AbstractInterceptor {

	/**
	 * 下一个拦截器
	 */
	protected AbstractInterceptor nextInterceptor;

	/**
	 * 递归处理拦截器链条
	 *
	 * @param request
	 */
	public void handleRequest(Request request) {
		if (!handle(request)) {
			return;
		}
		if (nextInterceptor != null) {
			nextInterceptor.handleRequest(request);
		}
	}

	/**
	 * 每个拦截器的业务处理
	 *
	 * @param message
	 * @return
	 */
	protected abstract boolean handle(Request message);
}
