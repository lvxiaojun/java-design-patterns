package com.structural.bridge.solution_2;
/**
 * 使用邮件方式发送信息
*/
public class EmailMessage implements Message{

	public void send(String message, String user) {
		System.out.println("使用邮件方式，发送信息【"+message+"】To【"+user+"】");
	}

}
