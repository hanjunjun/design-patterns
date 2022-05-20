package com.hanjunjun.designpatterns.creational.prototype;

import java.util.Random;

/**
 * @author hanjunjun
 */
public class EnemyPlane implements Cloneable{
	// 子弹
	private Bullet bullet;
	// 敌机横坐标
	private int x;
	// 敌机纵坐标
	private int y = 0;

	public EnemyPlane(int x,Bullet bullet) {
		this.x = x;
		this.bullet=bullet;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// 让敌机飞行
	public void fly() {
		// 每次调用让敌机的纵坐标+1
		y++;
	}

	public void setX(int x){
		this.x=x;
	}

	public void setBullet(Bullet bullet){
		this.bullet=bullet;
	}

	public Bullet getBullet(){
		return this.bullet;
	}

	@Override
	protected EnemyPlane clone() throws CloneNotSupportedException {
		EnemyPlane clone = (EnemyPlane) super.clone();
		// 子弹类是引用类型，复制EnemyPlane，Bullet只是地址被引用了，修改一个其他全部都会跟着变，需要复制Bullet，并重新赋值
		// 深拷贝每个敌机对象里的子弹对象都是不同的，不跑这段就是浅拷贝，每个敌机里的子弹对象都是同一个。
		clone.setBullet(this.bullet.clone());
		clone.getBullet().setSize(new Random().nextInt(200));
		return clone;
	}
}
