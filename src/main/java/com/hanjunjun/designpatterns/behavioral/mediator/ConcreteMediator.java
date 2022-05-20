package com.hanjunjun.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的中介者
 */
public class ConcreteMediator extends Mediator {
	/**
	 * 同事列表
	 */
	private List<Colleague> colleagues = new ArrayList<>();

	/**
	 * 注册同事
	 *
	 * @param colleague
	 */
	@Override
	public void register(Colleague colleague) {
		if (!colleagues.contains(colleague)) {
			// 把同事加到列表里
			colleagues.add(colleague);
			// 设置中介者
			colleague.setMediator(this);
		}
	}

	/**
	 * 转发给另一个同事
	 *
	 * @param colleague
	 */
	@Override
	public void relay(Colleague colleague) {
		for (Colleague ob :colleagues){
			if(!ob.equals(colleague)){
				// 给除自己以外的所有同事发送消息
				ob.receive();
			}
		}
	}
}
