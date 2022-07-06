package com.hanjunjun.designpatterns.creational.prototype;

import java.util.Random;

/**
 * 敌机
 */
public class EnemyPlane implements Cloneable {
	/**
	 * 子弹-引用类型
	 */
	private Bullet bullet;
	/**
	 * 敌机横坐标
	 */
	private int x;
	/**
	 * 敌机纵坐标
	 */
	private int y = 0;

	public EnemyPlane(int x, Bullet bullet) {
		this.x = x;
		this.bullet = bullet;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/**
	 * 让敌机飞行
	 */
	public void fly() {
		// 每次调用让敌机的纵坐标+1
		y++;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setBullet(Bullet bullet) {
		this.bullet = bullet;
	}

	public Bullet getBullet() {
		return this.bullet;
	}

	/**
	 * 克隆一个敌机
	 * 为了演示浅拷贝和深拷贝重新写了俩方法
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected EnemyPlane clone() throws CloneNotSupportedException {
		EnemyPlane clone = (EnemyPlane) super.clone();
		// 子弹类是引用类型，复制EnemyPlane，Bullet只是地址被引用了，修改一个其他全部都会跟着变，需要复制Bullet，并重新赋值
		// 深拷贝每个敌机对象里的子弹对象都是不同的，不跑这段就是浅拷贝，每个敌机里的子弹对象都是同一个。
		clone.setBullet(this.bullet.clone());
		clone.getBullet().setSize(new Random().nextInt(200));
		return clone;
	}

	/**
	 * 深拷贝
	 * 把属性是引用类型的全都要clone一遍，每一个bullet子弹对象地址是不同的
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	protected EnemyPlane cloneDeep() throws CloneNotSupportedException {
		// 克隆当前敌机对象
		EnemyPlane clone = (EnemyPlane) super.clone();
		// 克隆bullet子弹对象，并更新到克隆的bullet引用对象
		clone.setBullet(this.bullet.clone());
		clone.getBullet().setSize(new Random().nextInt(200));
		return clone;
	}

	/**
	 * 浅拷贝
	 * 把bullet子弹对象的地址指向到敌机对象的引用类型bullet上，每个敌机对象的子弹对象都是同一个
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	protected EnemyPlane cloneShallow() throws CloneNotSupportedException {
		// 克隆当前敌机对象
		EnemyPlane clone = (EnemyPlane) super.clone();
		// 更新子弹的大小，这行代码其实修改的都是同一个bullet引用对象，因为浅拷贝只是克隆指向地址
		clone.getBullet().setSize(new Random().nextInt(200));
		return clone;
	}
}
