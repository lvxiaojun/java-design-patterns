package com.creational.builder;

/**
 * 【建造者模式】
 * 导演类  Director
 *
 */
public class PenDirector {

	public Pen constructPen(PenBuilder builder) {
		//生产笔芯
		builder.buildCartridge();
		//生产外壳
		builder.buildShell();
		//组装笔
		return builder.buildPen();
	}
}
