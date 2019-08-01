package com.structural.adapter;

import com.structural.adapter.defaultAdapter.Person;
import com.structural.adapter.defaultAdapter.Student;

public class DefaultAdapter {

	public static void main(String[] args) {
		Person person = new Student("张三");
		person.study();
		person.eat();
		person.sleep();
	}
}
