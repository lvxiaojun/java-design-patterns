package com.creational.singleton;

/**
 * 单例模式：
 * 实现方式：懒汉式
 *
 */
public class SingletonTwo {

	private static SingletonTwo instance;
	private SingletonTwo() {
		
	}
	
	/**
	 * 方式1：普通写法---不采用
	 * 分析：在单线程中没有问题，但是如果在多线程中，当一个线程进入到判断语句if(null == instance)时发生阻塞，
	 *           此时第二个线程进来了，创建了一个实例对象，当阻塞被唤醒时，就会又创建一个对象实例，显然与单例模式不符合
	 * 问题：只能适用于单线程，多线程时存在创建多个实例的问题
	 */
	public static SingletonTwo getInstance1() {
		if(null == instance) {
			instance = new SingletonTwo();
		}
		return instance;
	}
	
	/**
	 * 改进方式2：添加一个同步锁---不采用
	 * 分析：下面的代码还是有点性能问题的，因为同步锁机制，多个线程获取类实例对象就会排队等待获取锁，这样是没有必要的，
	 *             因为当第一个线程执行完之后，实例对象已经创建好了，所以后续线程不需要进入加锁的代码块
	 * 问题：存在性能问题
	 */
	public static SingletonTwo getInstance2() {
		synchronized(SingletonTwo.class) {
			if(null == instance) {
				instance = new SingletonTwo();
			}
		}
		return instance;
	}
	
	/**
	 * 改进方式3：双重校验锁---推荐使用
	 * 分析：这种写法能够做到效率和安全的双重保证（适用于JDK1.5+）
	 */
	public static SingletonTwo getInstance3() {
		if(null == instance) {
			synchronized(SingletonTwo.class) {
				if(null == instance) {
					instance = new SingletonTwo();
				}
			}
		}
		return instance;
	}
}
