package com.factory.abstracts;

import com.creational.factory.abstracts.AbstractFactory;
import com.creational.factory.abstracts.AbstractMobile;
import com.creational.factory.abstracts.*;

public class HuaweiFactory implements AbstractFactory {

	@Override
	public AbstractMobile productMobile() {
		System.out.println("生产华为手机.");
		return new HuaweiMobile();
	}

	@Override
	public MP3 productMp3() {
		System.out.println("生产华为MP3.");
		return new HuaweiMP3();
	}

}
