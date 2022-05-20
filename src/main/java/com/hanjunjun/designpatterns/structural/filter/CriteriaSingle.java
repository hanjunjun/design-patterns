package com.hanjunjun.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身过滤器
 */
public class CriteriaSingle implements Criteria{
	/**
	 * 返回单身的人
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("单身")){
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}
