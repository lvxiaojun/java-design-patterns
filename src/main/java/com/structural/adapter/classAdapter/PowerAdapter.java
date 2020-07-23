package com.structural.adapter.classAdapter;

public class PowerAdapter extends RussiaScoket implements MyCharger{

	public void charge() {
		System.out.println("我是适配类：双脚扁头充电-->可以在->双脚圆形插孔充电.");
	    this.specificCharge();
	}

}
