package com.hanjunjun.designpatterns.behavioral.interpreter;

/**
 * 表达式
 */
public interface Expression {
	/**
	 * 翻译
	 *
	 * @param context 上下文
	 * @return 返回解释结果
	 */
	public boolean interpret(String context);
}
