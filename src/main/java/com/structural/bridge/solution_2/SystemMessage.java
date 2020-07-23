package com.structural.bridge.solution_2;
/**
 * 使用站內消息方式发送信息
*/
public class SystemMessage implements Message{

	public void send(String message, String user) {
		System.out.println("使用站內消息方式，发送信息【"+message+"】To【"+user+"】");
	}

}
