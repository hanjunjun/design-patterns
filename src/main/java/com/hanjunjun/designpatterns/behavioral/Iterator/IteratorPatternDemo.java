package com.hanjunjun.designpatterns.behavioral.Iterator;

/**
 * 迭代器模式
 * 用迭代器模式设计一个简易的ArrayList集合
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		System.out.println("定义自定义的ArrayList集合");
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("添加元素a,b,c");
		// 获取迭代器
		Iterator iterator = list.getIterator();
		System.out.println("获取ArrayList迭代器");
		// 判断迭代器是否存在下一个元素
		while (iterator.hasNext()) {
			// 从第一个开始返回元素
			System.out.println("获取元素：" + iterator.next());
		}
	}
}
