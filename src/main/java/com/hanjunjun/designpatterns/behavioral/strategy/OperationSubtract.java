package com.hanjunjun.designpatterns.behavioral.strategy;

/**
 * 两数相减策略
 */
public class OperationSubtract implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}
