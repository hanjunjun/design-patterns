package com.hanjunjun.designpatterns.j2ee.dataaccessobject;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据访问DAO实现
 */
public class StudentDaoImpl implements StudentDao {
	/**
	 * 数据源
	 */
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("张三", 0);
		Student student2 = new Student("杨戬", 1);
		students.add(student1);
		students.add(student2);
	}

	/**
	 * 获取所有学生
	 *
	 * @return
	 */
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	/**
	 * 获取指定学号的学生
	 *
	 * @param rollNo
	 * @return
	 */
	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	/**
	 * 更新学生信息
	 *
	 * @param student
	 */
	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("学生：学号 " + student.getRollNo() + ",姓名：" + student.getName() + "已更新到数据库中");
	}

	/**
	 * 删除学生
	 *
	 * @param student
	 */
	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("学生：学号 " + student.getRollNo() + ",姓名：" + student.getName() + "已从数据中删除");
	}
}
