package com.hanjunjun.designpatterns.structural.filter;

import java.util.List;

/**
 * 或过滤器
 */
public class OrCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/**
	 * 返回或过滤器满足条件的集合
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// 计算第一个集合
		// 结果：1,2,3,4,5
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		// 计算第二个集合（两次筛选都是独立的）
		// 结果：4,5,6,7,8
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		// 或运算，实际就是取2个集合的并集
		for (Person person : otherCriteriaItems) {
			// 遍历集合结果2的项目，如果集合2的项目在集合1中不存在就添加到集合1里
			if (!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		// 结果：1,2,3,4,5,6,7,8
		return firstCriteriaItems;
	}
}
