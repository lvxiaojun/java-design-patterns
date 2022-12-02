package com.factory.abstracts;

import com.creational.factory.abstracts.AbstractFactory;
import com.creational.factory.abstracts.HuaweiFactory;
import com.creational.factory.abstracts.XiaomiFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory factory = null;
		factory = new HuaweiFactory();
		factory.productMobile();
		factory.productMp3();
		
		factory = new XiaomiFactory();
		factory.productMobile();
		factory.productMp3();
		
	}
}
