package com.hanjunjun.designpatterns.behavioral.memento;

/**
 * 管理者
 * Caretaker[ˈkerteɪkər]
 */
public class Caretaker {
	/**
	 * 备忘录
	 */
	private Memento memento;

	/**
	 * 获取备忘录
	 *
	 * @return
	 */
	public Memento getMemento() {
		return memento;
	}

	/**
	 * 设置备忘录
	 *
	 * @param memento
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
