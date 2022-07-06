package com.hanjunjun.designpatterns.structural.adapter;

/**
 * 适配器模式
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "app.mp3");
		audioPlayer.play("mp4", "app.mp4");
		audioPlayer.play("vlc", "app.vlc");
		audioPlayer.play("avi", "app.avi");
	}
}
