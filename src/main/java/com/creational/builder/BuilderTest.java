package com.creational.builder;

/**
 * 【建造者模式】-测试类
 */
public class BuilderTest {

	public static void main(String[] args) {
		PenDirector director = new PenDirector();
		
		Pen ballpointpen = director.constructPen(new BallpointPenBuilder());
		
		Pen brushPen = director.constructPen(new BrushPenBuilder());
		
		System.out.println(ballpointpen.getCartridge()+ballpointpen.getShell());
		System.out.println(brushPen.getCartridge()+brushPen.getShell());
	}
}
