package com.structural.bridge.solution_2;
/**
 * 扩展抽象的消息---加急消息
 *
 */
public class UrgencyMessage extends AbstractMessage{

	public UrgencyMessage(Message messageImpl) {
		super(messageImpl);
	}
	
	public void sendMessage(String message, String user) {  
		message = "*加急*:" + message;
		super.sendMessage(message, user);  
	}  

}
