package com.singleton;

/**
 * 单例模式：
 * 实现方式：枚举
* 
 * 原理：在枚举中我们明确了构造方法限制为私有，在访问枚举实例时会执行构造方法，同时每个枚举实例都是static final类型的，
 *            也就表明只能被实例化一次。在调用构造方法时，我们的单例被实例化。
 *             也就是说，因为enum中的实例被保证只会被实例化一次，所以我们的INSTANCE也被保 证实例化一次
 * 
 * 问题：枚举实现单例，不推荐android平台使用，因为内存消耗会比其他方式多一些，android官方也不推荐枚举，
 *     android平台推荐：双重校验、静态内部类，现在的android开发环境jdk都大于1.5了，所以volatile的问题不必担心。
 *     java平台开发的Effective Java一书中推荐使用枚举实现单例，可以保证效率，而且还能解决反序列化创建新对象的问题。
 * 
 */

//需要创建的单例对象  源
class SingletonFourClass{
	public static void test() {
		System.out.println("这是单例模式的对象方法");
	}
}

/**
 * 枚举
 * 注： 1.枚举中的每个实例都是static final的，只能被实例化一次
 *  2.在访问枚举实例时会执行构造方法
 *  3.调用构造方法时，我们需要的单例被实例化，因为INSTANCE只被实例化一次，因为我们的单例也只被实例化一次
 *
 */
public enum SingletonFour {
	
	INSTANCE;
	private SingletonFourClass instance;
	
	SingletonFour(){
		instance = new SingletonFourClass();
	}
	
	public SingletonFourClass getInstance() {
		return instance;
	}
	
	
}
