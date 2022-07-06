package com.hanjunjun.designpatterns.behavioral.memento;

/**
 * 备忘录
 * Memento[məˈmentoʊ]
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
