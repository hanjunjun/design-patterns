package com.hanjunjun.designpatterns.j2ee.servicelocator;

/**
 * 实际处理请求的服务。这种服务的引用可以在JNDI服务器中查到
 */
public interface Service {
	public String getName();

	public void execute();
}
