package com.hanjunjun.designpatterns.behavioral.chain;

/**
 * 责任链抽象
 */
public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	protected int level;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	/**
	 * 责任链中的下一个元素
	 */
	protected AbstractLogger nextLogger;

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	protected abstract void write(String message);
}
