package com.creational.builder;

/**
 * 建造者（具体）---画笔builder
 *
 */
public class BrushPenBuilder implements PenBuilder{

	public Pen pen;
	public BrushPenBuilder() {
		pen = new BrushPen();
	}
	
	@Override
	public void buildCartridge() {
		pen.setCartridge("画笔笔芯");
	}

	@Override
	public void buildShell() {
		pen.setShell("画笔外壳");
	}

	@Override
	public Pen buildPen() {
		return pen;
	}

}
