package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 状态模式-使用类来代替各种状态，类里面的方法就是状态之间的变更逻辑，可以很灵活的来回切换状态
 */
public class StatePatternDemo {
	public static void main(String[] args) throws InterruptedException {
		DownloadStateContext context = new DownloadStateContext();
		// 开始下载5秒后下载完成
		System.out.println("操作：初始化下载任务");
		context.init();
		System.out.println("操作：开始下载");
		context.startThread(2);

		// 开始下载-状态间的切换
		System.out.println("-------------------------------");
		System.out.println("操作：初始化下载任务");
		context.init();
		System.out.println("操作：开始下载");
		context.start();
		System.out.println("操作：暂停");
		context.suspend();
		System.out.println("操作：继续");
		context.resume();
		System.out.println("3秒后下载完成");
		Thread.sleep(3000);
		context.complete(true, "下载成功");
	}
}
