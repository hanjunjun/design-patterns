package com.hanjunjun.designpatterns.behavioral.chain;

/**
 * 会话拦截器
 */
public class AuthorizationInterceptor extends AbstractInterceptor {

	@Override
	protected boolean handle(Request request) {
		System.out.println("会话拦截：" + (request.getAuthorization() ? "验证通过" : "验证失败"));
		return request.getAuthorization();
	}
}
