package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 下载完成状态
 */
public class DownloadCompleteState implements State {
	private final DownloadStateContext context;

	@Override
	public String name() {
		return "下载完成";
	}

	@Override
	public void init() {
		// 重置状态为未开始下载
		this.context.setCurrentState(this.context.getNotStartedDownloadState());
	}

	public DownloadCompleteState(DownloadStateContext context) {
		this.context = context;
	}

	@Override
	public void start() {

	}

	@Override
	public void suspend() {

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
