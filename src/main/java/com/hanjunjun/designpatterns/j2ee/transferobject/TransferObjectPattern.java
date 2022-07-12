package com.hanjunjun.designpatterns.j2ee.transferobject;

/**
 * 传输对象模式
 * VO：传输对象
 * BO：业务对象
 * BO获取VO传输对象
 */
public class TransferObjectPattern {
	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		// 输出所有学生
		System.out.println("输出所有学生信息StudentVO：");
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("学生：[RollNo:" + student.getRollNo() + ",Name:" + student.getName() + "]");
		}

		// 更新学生
		System.out.println("----------------------------------------");
		System.out.println("更新学生：");
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("李化元");
		System.out.println("设置学号=0的学生姓名为李化元");
		studentBusinessObject.updateStudent(student);

		// 获取学生
		System.out.println("----------------------------------------");
		System.out.println("获取学生信息StudentVO：");
		StudentVO student1 = studentBusinessObject.getStudent(0);
		System.out.println("学生：[RollNo:" + student1.getRollNo() + ",Name:" + student1.getName() + "]");
	}
}
