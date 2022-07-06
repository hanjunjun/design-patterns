package com.hanjunjun.designpatterns.j2ee.businessdelegate;

/**
 * 业务代表模式
 */
public class BusinessDelegatePatternDemo {
	public static void main(String[] args) {
		// 定义一个业务代表
		BusinessDelegate businessDelegate = new BusinessDelegate();
		// 定义一个客户端，把业务代表丢进去
		Client client = new Client(businessDelegate);

		System.out.println("让业务代表准备EJB服务");
		// 让业务代表准备一个EJB服务
		businessDelegate.setServiceType("EJB");

		// 执行服务
		client.doTask();

		System.out.println("让业务代表准备JMS服务");
		businessDelegate.setServiceType("JMS");

		// 执行服务
		client.doTask();
	}
}
