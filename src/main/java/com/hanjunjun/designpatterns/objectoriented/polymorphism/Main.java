package com.hanjunjun.designpatterns.objectoriented.polymorphism;

/**
 * 面向对象三大特性-多态
 */
public class Main {
	public static void main(String[] args) {
		Human human=new Human();
		human.eat(new Beef());
		human.eat(new Beef());
	}
}
