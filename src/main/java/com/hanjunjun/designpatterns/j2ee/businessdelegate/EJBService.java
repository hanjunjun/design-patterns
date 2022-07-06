package com.hanjunjun.designpatterns.j2ee.businessdelegate;

/**
 * 具体的业务服务
 */
public class EJBService implements BusinessService{
	@Override
	public void doProcessing() {
		System.out.println("处理EJB服务中");
	}
}
