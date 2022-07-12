package com.hanjunjun.designpatterns.j2ee.transferobject;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务对象
 */
public class StudentBO {
	List<StudentVO> students;

	public StudentBO() {
		this.students = new ArrayList<>();
		StudentVO student1 = new StudentVO("张无忌", 0);
		StudentVO student2 = new StudentVO("韩立", 1);
		students.add(student1);
		students.add(student2);
	}

	/**
	 * 删除学生
	 *
	 * @param student
	 */
	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("学生：RollNo" + student.getRollNo() + "已从数据库中删除");
	}

	/**
	 * 获取所有学生
	 *
	 * @return
	 */
	public List<StudentVO> getAllStudents() {
		return students;
	}

	/**
	 * 获取指定学号的学生
	 *
	 * @param rollNo
	 * @return
	 */
	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

	/**
	 * 更新学生信息
	 *
	 * @param student
	 */
	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("学生：Roll No" + student.getRollNo() + "已在数据库中更新");
	}
}