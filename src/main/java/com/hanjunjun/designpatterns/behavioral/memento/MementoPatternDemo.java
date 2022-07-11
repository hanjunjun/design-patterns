package com.hanjunjun.designpatterns.behavioral.memento;

/**
 * 备忘录模式
 */
public class MementoPatternDemo {
	public static void main(String[] args) {
		// 当前的业务状态
		Originator originator = new Originator();
		System.out.println("创建发起人");
		// 状态管理员
		Caretaker caretaker = new Caretaker();
		System.out.println("创建备份管理器");
		originator.setState("未开始");
		System.out.println("发起人初始状态：" + originator.getState());
		// 备份状态
		// 获取当前状态>放进状态管理器中
		caretaker.setMemento(originator.createMemento());
		System.out.println("发起人创建备忘录，并将备忘录放进备份管理器中");
		;
		originator.setState("下载中...");
		System.out.println("发起人新的状态：" + originator.getState());
		// 还原状态
		// 从状态管理器中获取保存的状态>还原到当前状态中
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("从备份管理器中取出备忘录传给发起人还原数据");
		System.out.println("发起人恢复之后的状态：" + originator.getState());
	}
}
