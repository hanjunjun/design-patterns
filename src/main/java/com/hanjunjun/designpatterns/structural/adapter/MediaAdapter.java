package com.hanjunjun.designpatterns.structural.adapter;

/**
 * 媒体适配器
 */
public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMediaPlayer;

	/**
	 * 定义媒体类型
	 *
	 * @param audioType
	 */
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		}
	}

	/**
	 * 播放对应媒体类型的文件
	 *
	 * @param audioType 音频类型
	 * @param fileName  文件名称
	 */
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		}
	}
}
