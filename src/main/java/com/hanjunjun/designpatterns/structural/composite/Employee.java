package com.hanjunjun.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 部门
	 */
	private String dept;
	/**
	 * 薪资
	 */
	private int salary;
	/**
	 * 下属
	 */
	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<>();
	}

	public void add(Employee employee) {
		subordinates.add(employee);
	}

	public void remove(Employee employee) {
		subordinates.remove(employee);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return ("Employee :[ 姓名 : " + name
				+ ", 部门 : " + dept + ", 薪资 :"
				+ salary + " ]");
	}
}
