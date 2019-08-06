package com.structural.bridge.solution_1;
/**
 * 使用站内消息方式发送【普通】信息
*/
public class CommonSystemMessage implements CommonMessage{

	@Override
	public void send(String message, String user) {
		message = "*普通*：" + message;
		System.out.println("使用站内消息方式，发送信息【"+message+"】To【"+user+"】");
	}

}
