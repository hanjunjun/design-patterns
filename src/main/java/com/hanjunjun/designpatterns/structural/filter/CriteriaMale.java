package com.hanjunjun.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 男性标准
 */
public class CriteriaMale implements Criteria {
	/**
	 * 返回集合中所有的男性
	 *
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// 男人列表
		List<Person> malePersons = new ArrayList<>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("男")) {
				malePersons.add(person);
			}
		}
		// 返回列表中所有的男性
		return malePersons;
	}
}
