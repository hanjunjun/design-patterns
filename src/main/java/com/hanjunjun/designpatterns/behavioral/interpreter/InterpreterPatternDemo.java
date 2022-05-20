package com.hanjunjun.designpatterns.behavioral.interpreter;

/**
 * 解释器模式
 */
public class InterpreterPatternDemo {
	/**
	 * 规则：Robert和John是男性
	 * @return
	 */
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("罗伯特");
		Expression john = new TerminalExpression("约翰");
		return new OrExpression(robert, john);
	}

	/**
	 * 规则：Julie是一个已婚的女性
	 * @return
	 */
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("朱莉");
		Expression married = new TerminalExpression("已婚");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale=getMaleExpression();
		Expression isMarriedWoman=getMarriedWomanExpression();

		System.out.println("约翰是男性吗？"+isMale.interpret("约翰"));
		System.out.println("张三是男性吗？"+isMale.interpret("张三"));
		System.out.println("朱莉是已婚女性吗？"+isMarriedWoman.interpret("朱莉已婚"));
		System.out.println("朱莉是已婚女性吗？"+isMarriedWoman.interpret("张三已婚"));
	}
}
