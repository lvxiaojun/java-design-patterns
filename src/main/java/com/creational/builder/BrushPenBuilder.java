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
	
	public void buildCartridge() {
		pen.setCartridge("画笔笔芯");
	}

	public void buildShell() {
		pen.setShell("画笔外壳");
	}

	public Pen buildPen() {
		return pen;
	}

}
