package com.structural.bridge.solution_1;

/**
 * 使用邮件方式发送【普通】消息
 *
 */
public class CommonEmailMessage implements CommonMessage{

	@Override
	public void send(String message, String user) {
		
		message = "*普通*："+message;
		System.out.println("使用邮件方式，发送消息：【"+message+"】To【"+user+"】");
	}

}
