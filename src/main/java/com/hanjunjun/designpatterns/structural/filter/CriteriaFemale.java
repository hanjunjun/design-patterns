package com.hanjunjun.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 女性标准
 */
public class CriteriaFemale implements Criteria {
	/**
	 * 返回集合中所有的女性
	 *
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// 女人列表
		List<Person> femalePersons=new ArrayList<>();
		for (Person person:persons){
			if(person.getGender().equalsIgnoreCase("女")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
