package com.hanjunjun.designpatterns.creational.prototype;

/**
 * 子弹
 */
public class Bullet implements Cloneable {
	private int size;

	public Bullet() {

	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	/**
	 * 克隆一发子弹
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Bullet clone() throws CloneNotSupportedException {
		return (Bullet) super.clone();
	}
}
