package com.adapter.defaultAdapter;

public class DefaultAdapterTest {

	public static void main(String[] args) {
		Person person = new Student("张三");
		person.study();
		person.eat();
		person.sleep();
	}
}
