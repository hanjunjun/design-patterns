package com.hanjunjun.designpatterns.j2ee.mvc;

/**
 * MVC的视图
 */
public class StudentView {
	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student:");
		System.out.println("Name:" + studentName);
		System.out.println("Roll No:" + studentRollNo);
	}
}
