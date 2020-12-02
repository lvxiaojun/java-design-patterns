package com.structural.facade;
/**
 * 类说明：电视接口实现类
 *
 */
public class TVImpl implements TV{

	@Override
	public void on() {
		System.out.println("打开电视");
	}

	@Override
	public void off() {
		System.out.println("关闭电视");
	}

}
