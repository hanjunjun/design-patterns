package com.hanjunjun.designpatterns.j2ee.businessdelegate;

/**
 * 业务代表，控制客户端执行哪种服务
 */
public class BusinessDelegate {
	private BusinessLookUp businessLookUp = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public BusinessDelegate() {
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = businessLookUp.getBusinessService(this.serviceType);
		businessService.doProcessing();
	}
}
