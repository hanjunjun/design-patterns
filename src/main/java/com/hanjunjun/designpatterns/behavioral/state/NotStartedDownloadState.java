package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 未开始下载状态
 */
public class NotStartedDownloadState implements State {
	private final DownloadStateContext context;
	@Override
	public String name() {
		return "未开始下载";
	}
	public NotStartedDownloadState(DownloadStateContext context) {
		this.context = context;
	}

	@Override
	public void init() {
		this.context.setCurrentState(this.context.getNotStartedDownloadState());
	}

	@Override
	public void start() {
		// 切换到下载中状态
		this.context.setCurrentState(this.context.getDownloading());
	}

	@Override
	public void suspend() {
		this.context.setCurrentState(this.context.getSuspendDownload());
	}

	@Override
	public void resume() {

	}

	@Override
	public void retry() {
		this.context.setCurrentState(this.context.getDownloading());
	}

	@Override
	public void complete(boolean success, String msg) {
		this.context.setCurrentState(this.context.getDownloadComplete());
	}
}
