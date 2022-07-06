package com.hanjunjun.designpatterns.behavioral.visitor;

/**
 * 单个单子的接口（相当于Element）
 * [bɪl]
 */
public interface Bill {
	void accept(AccountBookVisitor visitor);
}
