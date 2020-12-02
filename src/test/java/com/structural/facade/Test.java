package com.structural.facade;

public class Test {
	public static void main(String[] args) {
		//打开灯光
		Light light = new LightImpl();
		light.on();
		
		//打开电视
		TV tv = new TVImpl();
		tv.on();
		
		//关灯
		light.off();
		
		//关电视
		tv.off();
	}
}
