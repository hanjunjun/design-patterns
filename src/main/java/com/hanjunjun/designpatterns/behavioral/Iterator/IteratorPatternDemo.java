package com.hanjunjun.designpatterns.behavioral.Iterator;

import java.util.List;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		// List<String> ss=new java.util.ArrayList<String>();
		// ss.add("1");
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator iterator = list.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
