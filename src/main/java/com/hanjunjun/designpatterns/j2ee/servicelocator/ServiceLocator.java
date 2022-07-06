package com.hanjunjun.designpatterns.j2ee.servicelocator;

/**
 * 服务定位器是通过JNDI查找和缓存服务来获取的单点接触
 */
public class ServiceLocator {
	/**
	 * 全局静态缓存对象
	 */
	private static Cache cache;

	static {
		cache = new Cache();
	}

	/**
	 * 获取服务
	 * @param jndiName
	 * @return
	 */
	public static Service getService(String jndiName) {
		// 从缓存中获取服务
		Service service = cache.getServices(jndiName);
		if (service != null) {
			// 缓存中存在服务则返回
			return service;
		}

		InitialContext context = new InitialContext();
		// 从JNDI上下文中创建和查找一个服务对象
		Service service1 = (Service) context.lookup(jndiName);
		// 把获取的服务存储到缓存中，只有服务不存在缓存中才会添加到缓存中
		cache.addService(service1);
		return service1;
	}
}
