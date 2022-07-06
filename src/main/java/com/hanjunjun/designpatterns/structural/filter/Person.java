package com.hanjunjun.designpatterns.structural.filter;

import lombok.Data;

/**
 * 个人信息实体
 */
@Data
public class Person {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 婚姻状况
	 */
	private String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
}
