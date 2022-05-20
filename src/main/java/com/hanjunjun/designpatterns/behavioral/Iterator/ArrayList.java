package com.hanjunjun.designpatterns.behavioral.Iterator;

import java.util.List;

public class ArrayList<E> implements Collection {
	// ArrayList的内部是动态扩展数组
	// private static final Object[] EMPTY_ELEMENTDATA = {};
	// public Object[] names = EMPTY_ELEMENTDATA;
	public List<E> names = new java.util.ArrayList<>();
	int index;

	public void add(E e) {
		names.add(e);
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {


		@Override
		public boolean hasNext() {
			if (index < names.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names.get(index++);
			}
			return null;
		}
	}
}
