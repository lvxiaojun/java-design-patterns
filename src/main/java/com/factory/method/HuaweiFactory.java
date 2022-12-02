package com.factory.method;

import com.creational.factory.method.HuaweiMobile;
import com.creational.factory.method.Mobile;
import com.creational.factory.method.MobileFactory;

/**
* 类说明 ：具体工厂类 - 华为工厂
*/
public class HuaweiFactory implements MobileFactory {

	@Override
	public Mobile product() {
		System.out.println("生产华为手机.");
		return new HuaweiMobile();
	}
}
