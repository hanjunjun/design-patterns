package com.hanjunjun.designpatterns.behavioral.strategy;

/**
 * 策略模式
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		// 两数相加策略
		StrategyContext strategyContext = new StrategyContext(new OperationAdd());
		System.out.println("两数相加策略:");
		System.out.println("10+5=" + strategyContext.executeStrategy(10, 5));

		// 两数相减策略
		strategyContext = new StrategyContext(new OperationSubtract());
		System.out.println("两数相减策略:");
		System.out.println("10-5=" + strategyContext.executeStrategy(10, 5));

		// 两数相乘
		strategyContext = new StrategyContext(new OperationMultiply());
		System.out.println("两数相乘:");
		System.out.println("10*5=" + strategyContext.executeStrategy(10, 5));
	}
}
