package com.structural.bridge.solution_2;
/**
 * 实现发送消息的统一接口
 *
 */
public interface Message {

	/**
	 * 发送消息
	 * @param message 消息内容
	 * @param user 接收人
	 */
	public void send(String message,String user);
}
