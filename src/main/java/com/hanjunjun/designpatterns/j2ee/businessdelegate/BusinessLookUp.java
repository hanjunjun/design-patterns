package com.hanjunjun.designpatterns.j2ee.businessdelegate;

/**
 * 查询服务
 * 根据业务代表传过来的{serviceType}服务类型去生成不同的服务
 */
public class BusinessLookUp {
	/**
	 * 根据类型获取对应的服务
	 *
	 * @param serviceType
	 * @return
	 */
	public BusinessService getBusinessService(String serviceType) {
		if ("EJB".equalsIgnoreCase(serviceType)) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
