package com.creational.builder;

/**
 * 导演类  Director
 *
 */
public class PenDirector {

	public Pen constructPen(PenBuilder builder) {
		builder.buildCartridge();
		builder.buildShell();
		return builder.buildPen();
		
	}
}
