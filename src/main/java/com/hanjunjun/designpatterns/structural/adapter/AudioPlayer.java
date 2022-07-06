package com.hanjunjun.designpatterns.structural.adapter;

/**
 * 音频播放器
 */
public class AudioPlayer implements MediaPlayer {
	/**
	 * 播放视频的适配器
	 */
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		// 播放mp3文件的内置支持
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("playing mp3 file. Name:" + fileName);
		}
		// 提供了其他格式的文件播放方式
		else if (audioType.equalsIgnoreCase("vlc") ||
				audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("无效的音频：" + audioType + "格式不支持");
		}
	}
}
