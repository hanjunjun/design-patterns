package com.hanjunjun.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 男性标准
 */
public class CriteriaName implements Criteria {
	private String name;

	public CriteriaName(String name) {
		this.name = name;
	}

	/**
	 * 筛选出姓张的人
	 *
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		// 筛选出姓张的人
		List<Person> namePersons = new ArrayList<>();
		for (Person person : persons) {
			if (person.getName().startsWith(this.name)) {
				namePersons.add(person);
			}
		}
		return namePersons;
	}
}
