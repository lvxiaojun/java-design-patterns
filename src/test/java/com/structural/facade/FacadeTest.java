package com.structural.facade;

public class FacadeTest {

	public static void main(String[] args) {
		SmartHome smartHome = new SmartHomeImpl();
		
		smartHome.on();
		
		smartHome.off();
	}
}
