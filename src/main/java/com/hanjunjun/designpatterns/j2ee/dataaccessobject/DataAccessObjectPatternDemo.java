package com.hanjunjun.designpatterns.j2ee.dataaccessobject;

/**
 * 数据访问对象模式
 */
public class DataAccessObjectPatternDemo {
	public static void main(String[] args) {
		// 定义一个数据访问DAO对象
		StudentDao studentDao = new StudentDaoImpl();

		// 打印所有学生
		System.out.println("获取所有学生：");
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("学生：[学号：" + student.getRollNo() + ",姓名：" + student.getName() + "]");
		}

		// 更新学生
		System.out.println("-------------------------------------");
		System.out.println("更新学号为0的学生：");
		Student student = studentDao.getStudent(0);
		System.out.println("原学生信息：[学号：" + student.getRollNo() + ",姓名：" + student.getName() + "]");
		student.setName("韩立");
		studentDao.updateStudent(student);

		// 获取学生
		System.out.println("-------------------------------------");
		System.out.println("获取学号为0的学生：");
		Student student1 = studentDao.getStudent(0);
		System.out.println("学生：[学号：" + student1.getRollNo() + ",姓名：" + student1.getName() + "]");

		// 删除学生
		System.out.println("-------------------------------------");
		System.out.println("删除学生：");
		studentDao.deleteStudent(student);

		// 打印所有学生
		System.out.println("-------------------------------------");
		System.out.println("获取所有学生：");
		for (Student student2 : studentDao.getAllStudents()) {
			System.out.println("学生：[学号：" + student2.getRollNo() + ",姓名：" + student2.getName() + "]");
		}
	}
}
