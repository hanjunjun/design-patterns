package com.hanjunjun.designpatterns.behavioral.chain;

/**
 * csrf拦截器
 */
public class CsrfInterceptor extends AbstractInterceptor {

	@Override
	protected boolean handle(Request request) {
		System.out.println("csrf拦截验证：" + (request.getCsrfAdopt() ? "验证通过" : "验证失败"));
		return request.getCsrfAdopt();
	}
}
