package com.lvxiaojun.creational.singleton;

/**
 * 单例模式：
 * 实现方式二：饿汉式
 * 原理：声明一个私有的构造方法、创建私有的静态实例、公有的获取实例的方法
 * 
 */

public class SingletonTwo {
	
	//方式一：
	private static SingletonTwo instance = new SingletonTwo();
	
	//方法二：
	private static SingletonTwo instanceEx = null;
	
	private SingletonTwo() {
		
	}
	
	/**
	 *方式1：
	 *问题：如果该对象的构造函数很复杂的话，类加载时就会耗费很多性能、不采用
	 *
	 */
	public static SingletonTwo getInstance1() {
		return instance;
	}
	
	
	/**
	 * 方法2：
	 * 原理：在静态代码块中去创建实例，其实实现方式跟方式一差不多，都是在类加载的时候创建了实例，没有达到懒加载的机制
	 * 问题：如果该对象的构造函数很复杂的话，类加载时就会耗费很多性能、不采用
	 */
	static {
		instanceEx = new SingletonTwo();
	}
	public static SingletonTwo getInstance2() {
		return instanceEx;
	}
	
	
}
