package com.hanjunjun.designpatterns.structural.composite;

/**
 * 组合模式-树形图
 */
public class CompositePatternDemo {
	public static void main(String[] args) {
		// 老板
		Employee ceo = new Employee("刘备", "蜀国", 99999999);
		// 老板直接下属
		Employee zhangfei = new Employee("张飞", "战区1", 1000000);
		Employee guanyu = new Employee("关羽", "战区2", 1000000);
		Employee zhugeliang = new Employee("诸葛亮", "指挥部", 2000000);
		// 张飞下属
		Employee zhang1 = new Employee("张一", "战区1", 1000);
		Employee zhang2 = new Employee("张二", "战区1", 1000);
		Employee zhang3 = new Employee("张三", "战区1", 1000);
		Employee zhang4 = new Employee("张四", "战区1", 1000);
		// 关羽下属
		Employee guan1 = new Employee("关一", "战区2", 500);
		Employee guan2 = new Employee("关二", "战区2", 500);
		Employee guan3 = new Employee("关三", "战区2", 500);
		Employee guan4 = new Employee("关四", "战区2", 500);
		// 诸葛亮下属
		Employee zhuge1 = new Employee("诸葛一", "指挥部", 2000);
		Employee zhuge2 = new Employee("诸葛二", "指挥部", 2000);
		Employee zhuge3 = new Employee("诸葛三", "指挥部", 2000);
		Employee zhuge4 = new Employee("诸葛四", "指挥部", 2000);
		// 刘备直接下属人员
		ceo.add(zhangfei);
		ceo.add(guanyu);
		ceo.add(zhugeliang);
		// 张飞下属
		zhangfei.add(zhang1);
		zhangfei.add(zhang2);
		zhangfei.add(zhang3);
		zhangfei.add(zhang4);
		// 关羽下属
		guanyu.add(guan1);
		guanyu.add(guan2);
		guanyu.add(guan3);
		guanyu.add(guan4);
		// 诸葛亮下属
		zhugeliang.add(zhuge1);
		zhugeliang.add(zhuge2);
		zhugeliang.add(zhuge3);
		zhugeliang.add(zhuge4);
		// 打印整个组织下的员工
		System.out.println("-老板" + ceo);
		for (Employee employee : ceo.getSubordinates()) {
			System.out.println("--领导：" + employee.getName());
			for (Employee item : employee.getSubordinates()) {
				System.out.println("---" + item);
			}
		}
	}
}
