package com.hanjunjun.designpatterns.behavioral.Iterator;

import java.util.List;

/**
 * ArrayList集合对象
 *
 * @param <E>
 */
public class ArrayList<E> implements Collection {
	/**
	 * 集合的数据源
	 * JDK的ArrayList内部是使用数组实现的，这边使用List模拟
	 */
	public List<E> names = new java.util.ArrayList<>();
	int index;

	/**
	 * 添加一个元素
	 *
	 * @param e
	 */
	public void add(E e) {
		names.add(e);
	}

	/**
	 * 获取迭代器，通过迭代器去遍历集合的数据源
	 *
	 * @return
	 */
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	/**
	 * 获取是否存在下一个元素
	 */
	private class NameIterator implements Iterator {

		/**
		 * 是否
		 *
		 * @return
		 */
		@Override
		public boolean hasNext() {
			if (index < names.size()) {
				return true;
			}
			return false;
		}

		/**
		 * 获取下一个元素
		 *
		 * @return
		 */
		@Override
		public Object next() {
			if (this.hasNext()) {
				// i++：先把i先传给get(),然后在i=i+1
				return names.get(index++);
			}
			return null;
		}
	}
}
