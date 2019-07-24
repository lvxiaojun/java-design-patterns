package com.lvxiaojun.creational.singleton;

/**
 * 单例模式：
 * 实现方式一：懒汉式
 *
 */
public class SingletonOne {
	
	private static SingletonOne singletonOne;
	private SingletonOne() {
		
	}
	
	/**
	 * 分析：getInstance1()以下为普通写法，在单线程中没有任何问题。
	 * 但是如果在多线程中，当一个线程进入到判断语句中if(null==singletonOne){}时发生线程阻塞，
	 * 此时第二个线程进来了，创建了一个对象实例，当阻塞线程被唤醒时，就会又创建一个对象实例，显然与单例模式不符合
	 * 
	 * 问题：存在多线程时创建多个实例的问题、不采用
	 * @return
	 */
	public static SingletonOne getInstance1() {
		if(null==singletonOne) {
			singletonOne = new SingletonOne();
		}
		return singletonOne;
	}
	
	/**
	 * 改进写法1：添加一个同步锁
	 * 分析：下面的代码还是有点性能问题的，因为同步锁的机制，多个线程获取类实例对象会排队等待获取锁，这样是没有必要的，
	 *     因为大多数情况下类实例对象已经创建成功了，所以不用进入加锁的代码块
	 *     
	 * 问题：存在性能问题 、不采用
	 * @return
	 */
	public static SingletonOne getInstance2() {
		synchronized (SingletonOne.class) {
			if(null==singletonOne) {
				singletonOne = new SingletonOne();
			}
		}
		return singletonOne;
	}
	
	/**
	 * 改进写法2：双重校验锁
	 * 分析：这种写法能够做到效率和安全的双重保证（适用JDK1.5+）
	 * 
	 * 问题：推荐使用
	 * @return
	 */
	public static SingletonOne getInstance3() {
		if(null==singletonOne) {
			synchronized (SingletonOne.class) {
				if(null==singletonOne) {
					singletonOne = new SingletonOne();
					System.out.println("创建singletonOne对象实例");
				}
			}
		}
		return singletonOne;
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread() {
				public void run() {
					super.run();
					System.out.println("thread:"+getId());
					SingletonOne.getInstance3();
				}
			}.start();
		}
	}
}
