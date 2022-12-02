package com.factory.simple;

import com.creational.factory.simple.HuaweiMobile;
import com.creational.factory.simple.Mobile;
import com.creational.factory.simple.XiaomiMobile;

/**
 * 简单工厂
 *
 */
public class MobileFactory {

	/**
	    * 静态工厂方法
	 * @param type
	 * @return
	 */
	public static com.creational.factory.simple.Mobile product(int type) {
		Mobile mobile = null;
		switch (type) {
		case 1:
			mobile = new HuaweiMobile();
			System.out.println("hello,欢迎使用华为手机！");
			break;
		default:
			mobile = new XiaomiMobile();
			System.out.println("hello,欢迎使用小米手机！");
			break;
		}
		return mobile;
	} 
}
