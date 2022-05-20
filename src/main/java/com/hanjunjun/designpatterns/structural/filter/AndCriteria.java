package com.hanjunjun.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 和过滤器
 */
public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/**
	 * 返回和过滤器满足标准
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// 第一个过滤器筛选一遍
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		// 【第一个过滤器】得到的结果放到【第二个过滤器】里在过滤一遍
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}
