package com.structural.bridge.solution_2;
/**
 * 抽象的消息对象
 *
 */
public abstract class AbstractMessage {

	//持有一个实现部分的对象
	protected Message messageImpl;
	
	/**
	 * 构造方法，传入实现部分的对象
	 * @param messageImpl
	 */
	public AbstractMessage(Message messageImpl) {
		this.messageImpl = messageImpl;
	}
	
	/**
	 * 发送消息，转调实现部分的方法
	 * @param message 消息内容
	 * @param user 接收人
	 */
	public void sendMessage(String message,String user) {
		this.messageImpl.send(message, user);
	}
	
}
