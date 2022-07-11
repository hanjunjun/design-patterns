package com.hanjunjun.designpatterns.behavioral.memento;

/**
 * 备忘录
 * Memento[məˈmentoʊ]
 */
public class Memento {
	/**
	 * 需要备份的数据
	 */
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	/**
	 * 获取备份数据
	 *
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 设置备份数据
	 *
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
}
