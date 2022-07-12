package com.hanjunjun.designpatterns.j2ee.dataaccessobject;

import java.util.List;

/**
 * 数据访问DAO接口
 */
public interface StudentDao {
	/**
	 * 获取所有学生
	 *
	 * @return
	 */
	List<Student> getAllStudents();

	/**
	 * 获取指定学号的学生
	 *
	 * @param rollNo
	 * @return
	 */
	Student getStudent(int rollNo);

	/**
	 * 更新学生信息
	 *
	 * @param student
	 */
	void updateStudent(Student student);

	/**
	 * 删除学生
	 *
	 * @param student
	 */
	void deleteStudent(Student student);
}
