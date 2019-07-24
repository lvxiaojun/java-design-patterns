package com.creational.factory.simple;

/**
* 类说明 ：测试
*/
public class Test {
	public static void main(String[] args) {
		/**
		 * 客户要订购生产苹果小米手机
		 */
		SimpleMobileFactory.product(1);
		/**
		 * 客户要订购生产华为手机
		 */
		SimpleMobileFactory.product(2);
		/**
		 * 客户要订购生产小米锤子手机
		 */
		SimpleMobileFactory.product(3);
	}
}
