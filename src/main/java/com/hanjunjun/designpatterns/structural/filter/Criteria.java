package com.hanjunjun.designpatterns.structural.filter;

import java.util.List;

/**
 * 标准
 */
public interface Criteria {
	/**
	 * 筛选出满足标准的数据
	 *
	 * @param persons
	 * @return
	 */
	public List<Person> meetCriteria(List<Person> persons);
}
