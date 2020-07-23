package com.structural.bridge.solution_1;
/**
 * 使用短信方式发送【普通】信息
*/
public class CommonMobileMessage implements CommonMessage{

	public void send(String message, String user) {
		message = "*普通*：" + message;
		System.out.println("使用短信方式，发送信息【"+message+"】To【"+user+"】");
	}

}
