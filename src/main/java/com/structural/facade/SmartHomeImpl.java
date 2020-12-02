package com.structural.facade;

public class SmartHomeImpl implements SmartHome{

	private Light light = new LightImpl();
	private TV tv = new TVImpl();
	
	@Override
	public void on() {
		light.on();
		tv.on();
	}

	@Override
	public void off() {
		light.off();
		tv.off();
	}

}
