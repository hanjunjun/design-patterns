package com.hanjunjun.designpatterns.j2ee.dataaccessobject;

public class DataAccessObjectPattern {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		// 打印所有学生
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("学生：[学号：" + student.getRollNo() + ",姓名：" + student.getName() + "]");
		}

		// 更新学生
		Student student = studentDao.getStudent(0);
		student.setName("韩立");
		studentDao.updateStudent(student);

		// 获取学生
		Student student1= studentDao.getStudent(1);
		System.out.println("学生：[学号：" + student1.getRollNo() + ",姓名：" + student1.getName() + "]");

		// 删除学生
		studentDao.deleteStudent(student);
	}
}
