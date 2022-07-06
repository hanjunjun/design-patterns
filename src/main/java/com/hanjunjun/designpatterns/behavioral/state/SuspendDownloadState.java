package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 已暂停状态
 */
public class SuspendDownloadState implements State{
	private final DownloadStateContext context;
	@Override
	public String name() {
		return "已暂停";
	}
	public SuspendDownloadState(DownloadStateContext context) {
		this.context = context;
	}

	@Override
	public void init() {

	}

	@Override
	public void start() {

	}

	@Override
	public void suspend() {

	}

	@Override
	public void resume() {
		this.context.setCurrentState(this.context.getDownloading());
	}

	@Override
	public void retry() {

	}

	@Override
	public void complete(boolean success, String msg) {

	}
}
