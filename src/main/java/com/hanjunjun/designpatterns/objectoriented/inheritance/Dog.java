package com.hanjunjun.designpatterns.objectoriented.inheritance;

/**
 * 犬科类
 */
public class Dog {
	/**
	 * 品种
	 */
	protected String breeds;
	/**
	 * 性别
	 */
	protected boolean sex;
	/**
	 * 毛色
	 */
	protected String color;
	/**
	 * 年龄
	 */
	protected int age;

	public Dog() {

	}

	public Dog(String breeds) {
		this.setBreeds(breeds);
		this.setSex(true);
		this.setColor("黑白色");
		this.setAge(0);
	}

	/**
	 * 狗叫-所有的狗都能狗叫
	 */
	public void bark() {
		System.out.println("汪汪汪");
	}

	/**
	 * 设置品种-出生之后就无法设置了
	 *
	 * @param breeds
	 */
	private void setBreeds(String breeds) {
		this.breeds = breeds;
	}

	/**
	 * 获取狗的性别
	 *
	 * @return
	 */
	public boolean isSex() {
		return sex;
	}

	/**
	 * 设置性别-出生之后就无法设置
	 *
	 * @param sex
	 */
	private void setSex(boolean sex) {
		this.sex = sex;
	}

	/**
	 * 获取毛色
	 *
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 设置毛色-出生之后就无法设置
	 *
	 * @param color
	 */
	private void setColor(String color) {
		this.color = color;
	}

	/**
	 * 获取年龄
	 *
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 设置年龄-出生之后就无法设置
	 *
	 * @param age
	 */
	private void setAge(int age) {
		this.age = age;
	}
}
