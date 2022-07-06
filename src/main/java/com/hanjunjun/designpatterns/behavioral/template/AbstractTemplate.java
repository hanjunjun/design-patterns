package com.hanjunjun.designpatterns.behavioral.template;

public abstract class AbstractTemplate {
	/**
	 * 钩子方法
	 * 健康码登记
	 */
	protected void registerHealthCode(){

	}
	/**
	 * 具体方法
	 * 取号
	 */
	protected void takeNumber(){
		System.out.println("叫号机取号");
	}

	/**
	 * 具体方法
	 * 排队
	 */
	protected void lineUp(){
		System.out.println("排队");
	}

	/**
	 * 抽象方法
	 * 办理指定的业务
	 */
	abstract void handleDesignatedBusiness();

	/**
	 * 具体方法
	 * 评分
	 */
	protected void score(){
		System.out.println("业务办理完成，给柜员评分");
	}

	/**
	 * 办业务整个流程
	 */
	protected void handleBusiness(){
		// 健康码登记
		registerHealthCode();
		// 取号
		takeNumber();
		// 排队
		lineUp();
		// 办理指定的业务
		handleDesignatedBusiness();
		// 评分
		score();
	}

}
