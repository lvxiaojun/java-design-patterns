package com.factory.method;

import com.creational.factory.method.Mobile;

/**
* 类说明 ：抽象手机生产工厂
*/
public abstract interface MobileFactory {
	
	public abstract Mobile product();
}
