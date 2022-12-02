package com.factory.abstracts;

import com.creational.factory.abstracts.AbstractMobile;
import com.creational.factory.abstracts.MP3;

/**
* 类说明 ：抽象工厂类
*/
public abstract interface AbstractFactory {

	public abstract AbstractMobile productMobile();
	public abstract MP3 productMp3();
	
}
