package com.hanjunjun.designpatterns.j2ee.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * 缓存存储服务的引用，以便复用他们
 */
public class Cache {
	private List<Service> services;

	public Cache() {
		this.services = new ArrayList<>();
	}

	public Service getServices(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("返回缓存" + serviceName + "对象");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}
