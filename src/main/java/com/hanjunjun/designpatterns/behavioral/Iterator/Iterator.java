package com.hanjunjun.designpatterns.behavioral.Iterator;

/**
 * 迭代器接口
 */
public interface Iterator {
	/**
	 * 获取是否存在下一个元素
	 *
	 * @return
	 */
	boolean hasNext();

	/**
	 * 获取下一个元素
	 *
	 * @return
	 */
	public Object next();
}
