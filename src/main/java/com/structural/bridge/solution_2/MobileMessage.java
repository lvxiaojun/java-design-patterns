package com.structural.bridge.solution_2;
/**
 * 使用短信方式发送信息
 *
 */
public class MobileMessage implements Message{

	@Override
	public void send(String message, String user) {
		System.out.println("使用短信方式，发送信息【"+message+"】To【"+user+"】");
	}

}
