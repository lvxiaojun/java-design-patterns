package com.adapter.classAdapter;

/**
 * 测试
 */
public class ClassAdapterTest {
	public static void main(String[] args) {
		MyCharger charger = new PowerAdapter();
		//通过适配器调用特殊功能
		charger.charge();
	}
}
