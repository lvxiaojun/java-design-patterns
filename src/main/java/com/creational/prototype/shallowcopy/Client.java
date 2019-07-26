package com.creational.prototype.shallowcopy;

import java.util.ArrayList;
import java.util.List;

import com.common.util.DateFormatUtil;


/** 
 * 浅拷贝 -- 测试
 */
public class Client {
	public static void main(String[] args) {
		List<String> executors = new ArrayList<String>();
		executors.add("张三");
		executors.add("李四");
		
		Plan plan = new Plan();
		plan.setName("更改登录业务需求");
		plan.setLevel(1);
		plan.setStartdate(DateFormatUtil.stringToDate(DateFormatUtil.YYYYMMDD,"2017-08-07"));
		plan.setEnddate(DateFormatUtil.stringToDate(DateFormatUtil.YYYYMMDD,"2017-08-09"));
		plan.setExecutors(executors);
		
		Plan plan2 = plan.clone();
		plan2.setName("后端代码优化");
		plan2.setLevel(2);
		plan2.setStartdate(DateFormatUtil.stringToDate(DateFormatUtil.YYYYMMDD,"2017-08-10"));
		plan2.setEnddate(DateFormatUtil.stringToDate(DateFormatUtil.YYYYMMDD,"2017-08-12"));
		
		System.out.println("plan和plan2两个对象地址是否相等："+(plan == plan2));
		System.out.println("plan.getName()与plan2.getName()是否相等："+(plan.getName() == plan2.getName()));
		System.out.println("plan.getLevel()与plan2.getLevel()是否相等："+(plan.getLevel() == plan2.getLevel()));
		System.out.println("plan.getStartdate()与plan2.getStartdate()是否相等："+(plan.getStartdate() == plan2.getStartdate()));
		System.out.println("plan.getEnddate()与plan2.getEnddate()是否相等："+(plan.getEnddate() == plan2.getEnddate()));
		System.out.println("plan.getExecutors()与plan2.getExecutors()是否相等："+(plan.getExecutors() == plan2.getExecutors()));
		
		System.out.println("plan:"+plan.toString());
		System.out.println("plan2:"+plan2.toString());
	
		
		//plan任务比较重，在给plan添加一个人
		executors.add("王五");
		plan.setExecutors(executors);
		
		System.out.println();
		System.out.println("地址是否一样？"+(plan == plan2));
		System.out.println("plan.getName()与plan2.getName()是否相等："+(plan.getName() == plan2.getName()));
		System.out.println("plan.getLevel()与plan2.getLevel()是否相等："+(plan.getLevel() == plan2.getLevel()));
		System.out.println("plan.getStartdate()与plan2.getStartdate()是否相等："+(plan.getStartdate() == plan2.getStartdate()));
		System.out.println("plan.getEnddate()与plan2.getEnddate()是否相等："+(plan.getEnddate() == plan2.getEnddate()));
		System.out.println("plan.getExecutors()与plan2.getExecutors()是否相等："+(plan.getExecutors() == plan2.getExecutors()));
		System.out.println("plan:"+plan.toString());
		System.out.println("plan2:"+plan2.toString());
	}
}
