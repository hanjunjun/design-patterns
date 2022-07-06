package com.hanjunjun.designpatterns.behavioral.chain;

import lombok.Data;

/**
 * http 请求封装
 */
@Data
public class Request {
	/**
	 * 是否已授权
	 */
	Boolean authorization;
	/**
	 * xss验证是否通过
	 */
	Boolean xssAdopt;
	/**
	 * csrf验证是否通过
	 */
	Boolean csrfAdopt;
	/**
	 * 接口地址
	 */
	String url;
}
