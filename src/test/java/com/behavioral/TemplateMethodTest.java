package com.behavioral;

import com.behavioral.template_method.StudentA;
import com.behavioral.template_method.StudentB;

public class TemplateMethodTest {

	public static void main(String[] args) {
		StudentA a = new StudentA();
		a.workflow();
		
		StudentB b = new StudentB();
		b.workflow();
	}
}
