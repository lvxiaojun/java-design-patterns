package com.behavioral.template_method;

public abstract class AbstractHomework {

	public void workflow() {
		this.assginHomework();
		
		this.doHomework();
		
		this.checkHomework();
	}
	
	//老师--布置作业
	void assginHomework() {
		System.out.println("回家做课后习题，明天检查！");
	}
	
	//学生--做作业
	abstract void doHomework();
	
	//老师--检查作业
	void checkHomework() {
		System.out.println("检查作业！");
	}
	
}
