package com.builder;


/**
 * 【建造者模式】
 */
public abstract interface PenBuilder {

	//生产笔芯
	abstract void buildCartridge();
	
	//生产外壳
	abstract void buildShell();
	
	//组装笔
	abstract Pen buildPen();
}
