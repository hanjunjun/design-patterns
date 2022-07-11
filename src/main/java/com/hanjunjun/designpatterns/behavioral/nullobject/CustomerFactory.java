package com.hanjunjun.designpatterns.behavioral.nullobject;

/**
 * 消费者工厂
 */
public class CustomerFactory {
	public static final String[] names = {"张无忌", "张三丰", "铁木真", "曹操"};

	/**
	 * 根据参数name获取对象包装器
	 *
	 * @param name
	 * @return
	 */
	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer(name);
	}
}
