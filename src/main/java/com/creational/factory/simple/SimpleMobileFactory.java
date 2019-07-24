package com.creational.factory.simple;

/**
 * 简单工厂
 *
 */
public class SimpleMobileFactory {

	/**
	    * 静态工厂方法
	 * @param type
	 * @return
	 */
	public static Mobile product(int type) {
		Mobile mobile = null;
		switch (type) {
		case 1:
			mobile = new AppleMobile();
			mobile.sayHello();
			break;
		case 2:
			mobile = new HuaweiMobile();
			mobile.sayHello();
			break;
		default:
			mobile = new XiaomiMobile();
			mobile.sayHello();
			break;
		}
		return mobile;
	} 
}
