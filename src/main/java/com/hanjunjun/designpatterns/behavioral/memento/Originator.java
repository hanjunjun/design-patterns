package com.hanjunjun.designpatterns.behavioral.memento;

/**
 * 发起人
 * Originator[əˈrɪdʒɪneɪtər]
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 创建一个备忘录
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(state);
	}

	/**
	 * 还原备忘录
	 * @param m
	 */
	public void restoreMemento(Memento m){
		this.setState(m.getState());
	}
}
