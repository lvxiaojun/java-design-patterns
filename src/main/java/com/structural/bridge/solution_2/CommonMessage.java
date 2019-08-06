package com.structural.bridge.solution_2;
/**
 * 扩展抽象的消息---普通消息
 *
 */
public class CommonMessage extends AbstractMessage{

	public CommonMessage(Message messageImpl) {
		super(messageImpl);
	}
	
	public void sendMessage(String message,String user) {
		message = "*普通*:" + message;
		super.sendMessage(message, user);
	}

}
