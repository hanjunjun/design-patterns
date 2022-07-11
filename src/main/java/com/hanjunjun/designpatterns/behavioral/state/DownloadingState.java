package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 下载中状态
 */
public class DownloadingState implements State {
	private final DownloadStateContext context;

	/**
	 * 状态名称
	 *
	 * @return
	 */
	@Override
	public String name() {
		return "下载中";
	}

	/**
	 * 初始化下载
	 */
	@Override
	public void init() {

	}

	public DownloadingState(DownloadStateContext context) {
		this.context = context;
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
