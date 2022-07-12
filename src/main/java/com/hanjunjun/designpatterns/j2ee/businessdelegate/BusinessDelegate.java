package com.hanjunjun.designpatterns.j2ee.businessdelegate;

/**
 * 业务代表，控制客户端执行哪种服务
 */
public class BusinessDelegate {
	/**
	 * 查询服务
	 */
	private BusinessLookUp businessLookUp = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	public BusinessDelegate() {
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * 查询服务，得到指定的服务并执行
	 */
	public void doTask() {
		// 获取指定的服务
		businessService = businessLookUp.getBusinessService(this.serviceType);
		// 执行服务
		businessService.doProcessing();
	}
}