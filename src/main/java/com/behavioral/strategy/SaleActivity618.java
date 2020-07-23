package com.behavioral.strategy;

/**
 * 类说明：定义具体的促销活动---618活动
 *
 */
public class SaleActivity618 implements AbstractSaleActivity{

	@Override
	public void saleEvent() {
		System.out.println("618促销活动");
	}

}
