package com.hanjunjun.designpatterns.behavioral.memento;

/**
 * 备忘录模式
 */
public class MementoPatternDemo {
	public static void main(String[] args) {
		// 当前的业务状态
		Originator originator = new Originator();
		// 状态管理员
		Caretaker caretaker = new Caretaker();
		originator.setState("未开始");
		System.out.println("初始状态：" + originator.getState());
		// 备份状态
		// 获取当前状态>放进状态管理器中
		caretaker.setMemento(originator.createMemento());
		;
		originator.setState("下载中...");
		System.out.println("新的状态：" + originator.getState());
		// 还原状态
		// 从状态管理器中获取保存的状态>还原到当前状态中
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复之后的状态：" + originator.getState());
	}
}
