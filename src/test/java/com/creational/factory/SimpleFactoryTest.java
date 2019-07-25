package com.creational.factory;

import com.creational.factory.simple.MobileFactory;

/**
* 类说明 ：测试
*/
public class SimpleFactoryTest {
	public static void main(String[] args) {
		
		/**
		 * 客户要订购生产华为手机
		 */
		MobileFactory.product(1);
		/**
		 * 客户要订购生产小米手机
		 */
		MobileFactory.product(2);
	}
}
