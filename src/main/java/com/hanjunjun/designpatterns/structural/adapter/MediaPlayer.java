package com.hanjunjun.designpatterns.structural.adapter;

/**
 * 媒体播放器接口约束
 */
public interface MediaPlayer {
	/**
	 * 播放
	 *
	 * @param audioType 音频类型
	 * @param fileName  文件名称
	 */
	void play(String audioType, String fileName);
}
