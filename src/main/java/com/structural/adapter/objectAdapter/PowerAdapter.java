package com.structural.adapter.objectAdapter;

public class PowerAdapter implements MyCharger{

	//直接关联被适配类
	private RussiaSocket russiaScoket;
	
	//通过构造函数传入具体需要适配的被适配类对象
	public PowerAdapter(RussiaSocket russiaScoket) {
		this.russiaScoket = russiaScoket;
	}
	
	@Override
	public void charge() {
		//这里是使用委托的方式完成特殊功能
		System.out.println("我是适配类：双脚扁头充电->可以在->双脚圆形插孔充电.");
		this.russiaScoket.specificCharge();
	}

}
