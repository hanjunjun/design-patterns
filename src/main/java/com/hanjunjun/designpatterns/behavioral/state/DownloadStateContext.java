package com.hanjunjun.designpatterns.behavioral.state;

/**
 * 状态控制上下文
 */
public class DownloadStateContext {
	/**
	 * 当前状态
	 */
	private State currentState;
	/**
	 * 未开始状态
	 */
	private State notStartedDownloadState;
	/**
	 * 下载中
	 */
	private State downloading;
	/**
	 * 已暂停
	 */
	private State suspendDownload;
	/**
	 * 下载完成
	 */
	private State downloadComplete;


	public DownloadStateContext() {
		// 创建各个状态
		this.notStartedDownloadState = new NotStartedDownloadState(this);
		this.downloading = new DownloadingState(this);
		this.suspendDownload = new SuspendDownloadState(this);
		this.downloadComplete = new DownloadCompleteState(this);
		// 设置当前状态为未开始状态
		this.currentState = this.notStartedDownloadState;
	}

	/**
	 * 初始化下载任务
	 */
	public void init() {
		this.currentState.init();
	}

	/**
	 * 开始下载，等待5秒后下载完成
	 */
	public void startThread(Integer sleep) throws InterruptedException {
		this.currentState.start();
		Thread.sleep(sleep * 1000);
		System.out.println(sleep + "秒之后");
		this.complete(true, "下载成功");
	}

	/**
	 * 开始下载，不等待
	 */
	public void start() {
		this.currentState.start();
	}

	/**
	 * 暂停下载
	 */
	public void suspend() {
		this.currentState.suspend();
	}

	/**
	 * 继续下载
	 */
	public void resume() {
		this.currentState.resume();
	}

	/**
	 * 重试下载
	 */
	public void retry() {
		this.currentState.retry();
	}

	/**
	 * 下载完成，下载线程成功或失败之后回调此方法
	 */
	public void complete(boolean success, String msg) {
		this.currentState.complete(success, msg);
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		System.out.println("当前状态：" + this.currentState.name());
	}

	public State getNotStartedDownloadState() {
		return notStartedDownloadState;
	}

	public void setNotStartedDownloadState(State notStartedDownloadState) {
		this.notStartedDownloadState = notStartedDownloadState;
	}

	public State getDownloading() {
		return downloading;
	}

	public void setDownloading(State downloading) {
		this.downloading = downloading;
	}

	public State getSuspendDownload() {
		return suspendDownload;
	}

	public void setSuspendDownload(State suspendDownload) {
		this.suspendDownload = suspendDownload;
	}

	public State getDownloadComplete() {
		return downloadComplete;
	}

	public void setDownloadComplete(State downloadComplete) {
		this.downloadComplete = downloadComplete;
	}
}
