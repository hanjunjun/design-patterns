package com.hanjunjun.designpatterns.behavioral.strategy;

/**
 * 策略上下文
 */
public class StrategyContext {
	private Strategy strategy;

	public StrategyContext(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 执行策略
	 *
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int executeStrategy(int num1, int num2) {
		return this.strategy.doOperation(num1, num2);
	}
}
