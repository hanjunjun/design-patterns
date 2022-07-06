package com.hanjunjun.designpatterns.structural.adapter;

/**
 * 高级媒体播放器
 */
public interface AdvancedMediaPlayer {
	/**
	 * 播放vlc
	 *
	 * @param fileName
	 */
	public void playVlc(String fileName);

	/**
	 * 播放mp4
	 *
	 * @param fileName
	 */
	public void playMp4(String fileName);
}
