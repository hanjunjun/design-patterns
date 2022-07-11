package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 未开始下载状态
 */
public class NotStartedDownloadState implements State {
	private final DownloadStateContext context;

	/**
	 * 状态名称
	 *
	 * @return
	 */
	@Override
	public String name() {
		return "未开始下载";
	}

	public NotStartedDownloadState(DownloadStateContext context) {
		this.context = context;
	}

	/**
	 * 初始化下载
	 */
	@Override
	public void init() {
		this.context.setCurrentState(this.context.getNotStartedDownloadState());
	}

	/**
	 * 开始下载
	 */
	@Override
	public void start() {
		// 切换到下载中状态
		this.context.setCurrentState(this.context.getDownloading());
	}

	/**
	 * 暂停下载
	 */
	@Override
	public void suspend() {
		this.context.setCurrentState(this.context.getSuspendDownload());
	}

	/**
	 * 继续下载
	 */
	@Override
	public void resume() {

	}

	/**
	 * 重试下载
	 */
	@Override
	public void retry() {
		this.context.setCurrentState(this.context.getDownloading());
	}

	/**
	 * 下载完成
	 *
	 * @param success 下载是否成功
	 * @param msg     下载返回结果
	 */
	@Override
	public void complete(boolean success, String msg) {
		this.context.setCurrentState(this.context.getDownloadComplete());
	}
}
