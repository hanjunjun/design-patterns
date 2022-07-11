package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 状态的抽象
 */
public interface State {
	/**
	 * 状态名称
	 *
	 * @return
	 */
	String name();

	/**
	 * 初始化下载
	 */
	void init();

	/**
	 * 开始下载
	 */
	void start();

	/**
	 * 暂停下载
	 */
	void suspend();

	/**
	 * 继续下载
	 */
	void resume();

	/**
	 * 重试下载
	 */
	void retry();

	/**
	 * 下载完成
	 *
	 * @param success 下载是否成功
	 * @param msg     下载返回结果
	 */
	void complete(boolean success, String msg);
}
