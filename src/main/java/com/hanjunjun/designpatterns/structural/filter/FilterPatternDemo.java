package com.hanjunjun.designpatterns.structural.filter;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 */
public class FilterPatternDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("张三", "女", "单身"));
		persons.add(new Person("王二", "男", "已婚"));
		persons.add(new Person("李静", "女", "单身"));
		persons.add(new Person("张三丰", "男", "单身"));
		persons.add(new Person("张无忌", "男", "已婚"));
		persons.add(new Person("谢逊", "男", "单身"));
		persons.add(new Person("赵敏", "女", "已婚"));
		System.out.println("原始数据：");
		for (Person person : persons) {
			System.out.println(person.toString());
		}
		System.out.println("-----------------------------------------------------------------");
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();

		System.out.println("过滤出男人:");
		printPersons(male.meetCriteria(persons));

		System.out.println("过滤出女人:");
		printPersons(female.meetCriteria(persons));

		System.out.println("过滤出单身的人:");
		printPersons(single.meetCriteria(persons));

		// 过滤出单身的所有男性
		Criteria singleMale = new AndCriteria(single, male);
		System.out.println("过滤出单身的男性:");
		printPersons(singleMale.meetCriteria(persons));

		// 筛选出是单身或者是男性的集合
		Criteria singleOrMale = new OrCriteria(single, male);
		System.out.println("筛选出是单身或者是男性的集合：");
		printPersons(singleOrMale.meetCriteria(persons));

		// 筛选出是单身男性，并且姓张的人
		Criteria singleMaleAndName = new AndCriteria(new AndCriteria(single, male), new CriteriaName("张"));
		System.out.println("筛选出是单身男性,并且姓张的人：");
		printPersons(singleMaleAndName.meetCriteria(persons));

		// 筛选出是单身男性或者姓张的人
		Criteria singleMaleOrName = new OrCriteria(new AndCriteria(single, male), new CriteriaName("张"));
		System.out.println("筛选出是单身男性,或者姓张的人：");
		printPersons(singleMaleOrName.meetCriteria(persons));

	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("人 : [ 姓名 : " + person.getName()
					+ ", 性别 : " + person.getGender()
					+ ", 婚姻状况 : " + person.getMaritalStatus()
					+ " ]");
		}
		System.out.println("-----------------------------------------------------------------");
	}
}
