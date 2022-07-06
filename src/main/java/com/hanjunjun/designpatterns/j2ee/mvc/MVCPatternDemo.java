package com.hanjunjun.designpatterns.j2ee.mvc;

public class MVCPatternDemo {
	public static void main(String[] args) {
		// 查询学生数据
		Student model = retrieveStudentFromDatabase();
		// 创建一个视图
		StudentView view = new StudentView();
		// 创建一个控制器
		StudentController controller = new StudentController(model, view);

		// view根据model生成数据
		System.out.println("-------------------------");
		System.out.println("打印视图渲染结果：");
		controller.updateView();

		// 更新模型数据
		System.out.println("-------------------------");
		System.out.println("修改模型数据");
		controller.setStudentName("凡人修仙");

		// view根据model生成数据
		System.out.println("-------------------------");
		System.out.println("打印视图渲染结果：");
		controller.updateView();
	}

	/**
	 * 从数据库中检索学生信息
	 *
	 * @return
	 */
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("张无忌");
		student.setRollNo("10");
		return student;
	}
}
