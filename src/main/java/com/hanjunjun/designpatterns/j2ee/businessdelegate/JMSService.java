package com.hanjunjun.designpatterns.j2ee.businessdelegate;

/**
 * 具体的业务服务
 */
public class JMSService implements BusinessService {
	@Override
	public void doProcessing() {
		System.out.println("处理JMS服务中");
	}
}
