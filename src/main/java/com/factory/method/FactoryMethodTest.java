package com.factory.method;

/**
* 类说明 ：测试
*/
public class FactoryMethodTest {
	
	public static void main(String[] args) {
		MobileFactory factory = null;
		factory = new HuaweiFactory();
		factory.product();
		
		factory = new XiaomiFactory();
		factory.product();
	}
}
