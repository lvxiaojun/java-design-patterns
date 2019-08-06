package com.structural.bridge;

import com.structural.bridge.solution_2.AbstractMessage;
import com.structural.bridge.solution_2.CommonMessage;
import com.structural.bridge.solution_2.EmailMessage;
import com.structural.bridge.solution_2.Message;
import com.structural.bridge.solution_2.MobileMessage;
import com.structural.bridge.solution_2.UrgencyMessage;
import com.structural.bridge.solution_2.VeryUrgencyMessage;

public class BridgeClientTest {

	public static void main(String[] args) {
		
		//使用邮件发送消息
		//1.创建具体的实现对象
		Message messageImpl = new EmailMessage();
		
		//2.创建一个普通消息对象
		AbstractMessage am = new CommonMessage(messageImpl);
		am.sendMessage("本月需完成任务如下：...", "zhangsan");
		
		//3.创建一个加急消息对象
		am = new UrgencyMessage(messageImpl);
		am.sendMessage("本周需完成任务如下：...", "zhangsan");  
		
		//4.创建一个特急消息对象
		am = new VeryUrgencyMessage(messageImpl);
		am.sendMessage("尽快修复致命bug,今天客户端无法登陆的问题！", "zhangsan");  
		
		
		//手机发送消息
		messageImpl = new MobileMessage();
		am = new CommonMessage(messageImpl);
        am.sendMessage("本月需完成任务如下：...", "zhangsan");      
        am = new UrgencyMessage(messageImpl);  
        am.sendMessage("本周需完成任务如下：...", "zhangsan");     
        am = new VeryUrgencyMessage(messageImpl);  
        am.sendMessage("尽快修复致命bug,今天客户端无法登陆的问题！", "zhangsan");  
      
        
        //站内消息实现省略....
        
	}
}
