package com.hanjunjun.designpatterns.behavioral.memento;

/**
 * 管理者
 *  Caretaker[ˈkerteɪkər]
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
