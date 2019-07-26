package com.creational.factory.abstracts;

public class XiaomiFactory implements AbstractFactory{

	@Override
	public AbstractMobile productMobile() {
		System.out.println("生产小米手机.");
		return new XiaomiMobile();
	}

	@Override
	public MP3 productMp3() {
		System.out.println("生产小米MP3.");
		return new XiaomiMP3();
	}

}
