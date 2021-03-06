package com.hanjunjun.designpatterns.behavioral.strategy;

/**
 * 两数相乘策略
 */
public class OperationMultiply implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}
