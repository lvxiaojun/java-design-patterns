package com.creational.singleton;
/**
 * 单例模式：
 * 实现方式：饿汉式
 * 原理：声明一个私有的构造方法，创建私有的静态实例、公有的获取实例的方法
 *
 */
public class SingletonOne {

	//方式1：
	private static  SingletonOne instance = new SingletonOne();
	//方式2：
	private static SingletonOne instanceEx = null;
	
	private SingletonOne() {
		
	}
	/**
	 * 方式1：基础方法
	 * 问题：如果该对象的构造函数很复杂的话，类加载时就会耗费很多性能-----不采用
	 * 
	 */
	public static SingletonOne getInstance1() {
		return instance;
	}
	
	/////////////////////////////////////////////////////////////////////
	/**
	 * 方法2：静态代码块
	 * 原理：在静态代码块中创建实例，其实实现方式跟方式1差不多，都是在类加载的时候创建了实例，没有达到懒加载的机制
	 * 问题：如果该对象的构造函数很复杂的话，类加载时就会耗费很多性能---不采用
	 */
	static {
		instanceEx = new SingletonOne();
	}
	public static SingletonOne getInstance2() {
		return instanceEx;
	}
}
