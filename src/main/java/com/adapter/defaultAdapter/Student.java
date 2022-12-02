package com.adapter.defaultAdapter;


/**
 * 定义一个学生  继承了交往PersonAdapter抽象类
 * 学生并没有继承所有Person的行为，比如现在还不用work
 *
 */
public class Student extends PersonAdapter {
	private String name;
	public Student(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void study() {
		System.out.println("学习....");
	}
	public void eat() {
		System.out.println("吃饭....");
	}
	public void sleep() {
		System.out.println("睡觉....");
	}
}
