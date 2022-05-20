package com.hanjunjun.designpatterns.behavioral.chain;

public class DebugLogger extends AbstractLogger {
	public DebugLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("DebugLogger:" + message);
	}
}
