                     package com.structural.facade;
/**
 * 类说明：灯光接口实现类
 *
 */
public class LightImpl implements Light{

	@Override
	public void on() {
		System.out.println("打开灯");
	}

	@Override                                    
	public void off() {
		System.out.println("关闭灯");
	}

}
