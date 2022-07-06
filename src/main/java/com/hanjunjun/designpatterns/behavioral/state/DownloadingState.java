package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 下载中状态
 */
public class DownloadingState implements State {
	private final DownloadStateContext context;
	@Override
	public String name() {
		return "下载中";
	}
	@Override
	public void init() {

	}

	public DownloadingState(DownloadStateContext context) {
		this.context = context;
	}

	@Override
	public void start() {

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

	}

	@Override
	public void complete(boolean success, String msg) {
		this.context.setCurrentState(this.context.getDownloadComplete());
	}
}
