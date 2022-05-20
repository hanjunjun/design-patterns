package com.hanjunjun.designpatterns.structural.filter;

import java.util.List;

/**
 * 标准
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
