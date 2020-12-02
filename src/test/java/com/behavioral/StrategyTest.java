package com.behavioral;

import com.behavioral.strategy.ActivityEnter;

public class StrategyTest {

	public static void main(String[] args) {
		//618活动
		ActivityEnter activity = new ActivityEnter();
		activity.activityEnter("618");
		
		//1111活动
		ActivityEnter activity2 = new ActivityEnter();
		activity2.activityEnter("1111");
		
		//1212活动
		ActivityEnter activity3 = new ActivityEnter();
		activity3.activityEnter("1212");
	}
}
