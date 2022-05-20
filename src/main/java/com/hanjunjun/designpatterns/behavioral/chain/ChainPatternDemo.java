package com.hanjunjun.designpatterns.behavioral.chain;

/**
 * 责任链模式
 */
public class ChainPatternDemo {
	private static AbstractLogger getChainOfLoggers() {
		// 小鱼
		AbstractLogger consoleLogger = new InfoLogger(AbstractLogger.INFO);
		// 中鱼
		AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
		// 大鱼
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

		// 中鱼吃小鱼
		fileLogger.setNextLogger(consoleLogger);
		// 大鱼吃中鱼
		errorLogger.setNextLogger(fileLogger);

		// 返回大鱼
		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		System.out.println("INFO=1,DEBUG=2,ERROR=3");
		System.out.println("------------------------------------------------------");
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		System.out.println("------------------------------------------------------");
		loggerChain.logMessage(AbstractLogger.DEBUG,
				"This is a debug level information.");

		System.out.println("------------------------------------------------------");
		loggerChain.logMessage(AbstractLogger.ERROR,
				"This is an error information.");
	}
}
