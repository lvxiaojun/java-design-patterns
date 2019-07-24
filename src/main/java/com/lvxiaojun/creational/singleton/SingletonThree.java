package com.lvxiaojun.creational.singleton;

/**
 * 单例模式：
 * 实现方式三：使用静态内部类实现
 * 
 * 原理：同样利用了classLoader的机制来保证初始化instance时只有一个线程。比较饿汉式的两种方式，其实看起来差别不大，
 * 但是，使用静态内部类：
 *   当类SingletonThree被装载时，静态内部类SingletonClass并没有被类加载器装载，
 *   因此instance实例并没有被初始化，只有当外部调用getInstance()方法时才会去装载静态内部类，此时静态成员变量就会被加载，
 *   而且只加载一次，进而达到了懒加载机制，并且实现了单例模式
 *   
 * 问题：推荐使用
 * 
 */

public class SingletonThree {
	
	private static class SingletonClass {
		private static SingletonThree instance = new SingletonThree();
	}
	public static SingletonThree getInstance() {
		return SingletonClass.instance;
	}
}
