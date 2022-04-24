package com.hanjunjun.designpatterns.objectoriented.Polymorphism;

public class Main {
	public static void main(String[] args) {
		Human human=new Human();
		human.eat(new Beef());
		human.eat(new Beef());
	}
}
