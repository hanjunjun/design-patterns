package com.hanjunjun.designpatterns.j2ee.dataaccessobject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("张三", 0);
		Student student2 = new Student("杨戬", 1);
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("学生：学号 " + student.getRollNo() + ",姓名：" + student.getName() + "已更新到数据库中");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("学生：学号 " + student.getRollNo() + ",姓名：" + student.getName() + "已从数据中删除");
	}
}
