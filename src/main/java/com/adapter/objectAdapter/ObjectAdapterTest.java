package com.adapter.objectAdapter;

public class ObjectAdapterTest {

	public static void main(String[] args) {
		//使用特殊功能类，即适配类
		//需要先创建一个被适配类的对象作为参数
		PowerAdapter adapter = new PowerAdapter(new RussiaSocket());
		adapter.charge();
	}
}
