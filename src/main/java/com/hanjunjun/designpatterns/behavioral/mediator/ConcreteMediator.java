package com.hanjunjun.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 房产中介
 */
public class ConcreteMediator extends Mediator {
	/**
	 * 客户列表
	 */
	private List<Colleague> colleagues = new ArrayList<>();

	/**
	 * 注册客户
	 *
	 * @param colleague
	 */
	@Override
	public void register(Colleague colleague) {
		if (!colleagues.contains(colleague)) {
			// 把客户加到列表里
			colleagues.add(colleague);
			// 设置中介者
			colleague.setMediator(this);
		}
	}

	/**
	 * 转发给另一个客户
	 *
	 * @param colleague
	 */
	@Override
	public void relay(Colleague colleague) {
		for (Colleague ob :colleagues){
			if(!ob.equals(colleague)){
				// 给除自己以外的所有客户发送消息
				ob.receive();
			}
		}
	}
}
