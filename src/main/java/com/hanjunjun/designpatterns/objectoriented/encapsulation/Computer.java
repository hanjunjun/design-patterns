package com.hanjunjun.designpatterns.objectoriented.encapsulation;

import lombok.Data;

/**
 * 面向对象三大特性-封装
 * 电脑类
 */
@Data
public class Computer {
	/**
	 * cpu
	 */
	private String cpu;
	/**
	 * 主板
	 */
	private String motherBoard;
	/**
	 * 硬盘
	 */
	private String hardDisk;
	/**
	 * 内存
	 */
	private String ram;
	/**
	 * 显卡
	 */
	private String graphicCard;

	/**
	 * 开机
	 */
	public void turnOn(){

	}

	/**
	 * 关机
	 */
	public void turnOff(){

	}

	/**
	 * 重启
	 */
	public void reset(){

	}
}
