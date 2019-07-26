package com.creational.builder;

/**
 * 抽象一个产品类
 *
 */
public abstract class Pen {

	private String cartridge;//笔芯
	private String shell;//外壳
	
	public String getCartridge() {
		return cartridge;
	}
	public void setCartridge(String cartridge) {
		this.cartridge = cartridge;
	}
	public String getShell() {
		return shell;
	}
	public void setShell(String shell) {
		this.shell = shell;
	}
	
	
}
