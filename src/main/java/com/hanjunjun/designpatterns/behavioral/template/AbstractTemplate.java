package com.hanjunjun.designpatterns.behavioral.template;

/**
 * 模板的抽象
 */
public abstract class AbstractTemplate {
	/**
	 * 钩子方法
	 * 1.健康码登记
	 */
	protected void registerHealthCode() {

	}

	/**
	 * 具体方法
	 * 2.取号
	 */
	protected void takeNumber() {
		System.out.println("叫号机取号");
	}

	/**
	 * 具体方法
	 * 3.排队
	 */
	protected void lineUp() {
		System.out.println("排队");
	}

	/**
	 * 抽象方法
	 * 4.办理指定的业务
	 */
	abstract void handleDesignatedBusiness();

	/**
	 * 具体方法
	 * 5.评分
	 */
	protected void score() {
		System.out.println("业务办理完成，给柜员评分");
	}

	/**
	 * 办业务整个流程
	 * 1,2,3,5都是去银行办业务固定的流程，4是办理不同的业务，比如存款，取钱，开卡等
	 */
	protected void handleBusiness() {
		// 1.健康码登记
		registerHealthCode();
		// 2.取号
		takeNumber();
		// 3.排队
		lineUp();
		// 4.办理指定的业务
		handleDesignatedBusiness();
		// 5.评分
		score();
	}
}
