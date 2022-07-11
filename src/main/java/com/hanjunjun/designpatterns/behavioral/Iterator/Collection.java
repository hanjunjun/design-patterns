package com.hanjunjun.designpatterns.behavioral.Iterator;

/**
 * 集合对象接口
 */
public interface Collection {
	/**
	 * 获取迭代器
	 *
	 * @return
	 */
	Iterator getIterator();
}
