package com.creational.builder;

/**
 * 建造者（具体）--圆珠笔builder
 *
 */
public class BallpointPenBuilder implements PenBuilder{

	public Pen pen;
	
	public BallpointPenBuilder() {
		pen = new BallpointPen();
	} 
	
	@Override
	public void buildCartridge() {
		pen.setCartridge("圆珠笔笔芯");
	}

	@Override
	public void buildShell() {
		pen.setShell("圆珠笔外壳");
	}

	@Override
	public Pen buildPen() {
		return pen;
	}

}
