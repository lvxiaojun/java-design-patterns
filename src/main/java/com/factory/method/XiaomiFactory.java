package com.factory.method;

import com.creational.factory.method.Mobile;
import com.creational.factory.method.MobileFactory;
import com.creational.factory.method.XiaomiMobile;

/**
* 类说明 ：具体工厂类 - 小米工厂
*/
public class XiaomiFactory implements MobileFactory {

	@Override
	public Mobile product() {
		System.out.println("生产小米手机.");
		return new XiaomiMobile();
	}

}
