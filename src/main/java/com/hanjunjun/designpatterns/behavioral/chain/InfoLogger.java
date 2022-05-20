package com.hanjunjun.designpatterns.behavioral.chain;

public class InfoLogger extends AbstractLogger {
	public InfoLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("InfoLogger：" + message);
	}
}
