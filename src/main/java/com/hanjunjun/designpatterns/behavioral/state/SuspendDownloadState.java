package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 已暂停状态
 */
public class SuspendDownloadState implements State {
	private final DownloadStateContext context;

	/**
	 * 状态名称
	 *
	 * @return
	 */
	@Override
	public String name() {
		return "已暂停";
	}

	public SuspendDownloadState(DownloadStateContext context) {
		this.context = context;
	}

	/**
	 * 初始化下载
	 */
	@Override
	public void init() {

	}

	/**
	 * 开始下载
	 */
	@Override
	public void start() {

	}

	/**
	 * 暂停下载
	 */
	@Override
	public void suspend() {

	}

	/**
	 * 继续下载
	 */
	@Override
	public void resume() {
		this.context.setCurrentState(this.context.getDownloading());
	}

	/**
	 * 重试下载
	 */
	@Override
	public void retry() {

	}

	/**
	 * 下载完成
	 *
	 * @param success 下载是否成功
	 * @param msg     下载返回结果
	 */
	@Override
	public void complete(boolean success, String msg) {

	}
}
