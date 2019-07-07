package com.itheima.timerx;

import java.util.Calendar;
import java.util.Date;

public class CalendarX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 获取日历对象
		Calendar ca = Calendar.getInstance();
		
		//使当前的日历对象跟当前的时间同步
		ca.setTime(new Date());
		
		//设置年月日
		ca.set(Calendar.YEAR, 2008);
		ca.set(Calendar.MONTH, 8-1);
		ca.set(Calendar.DAY_OF_MONTH, 8);
		
		//设置时分秒
		ca.set(Calendar.HOUR, 8);
		ca.set(Calendar.MINUTE, 8);
		ca.set(Calendar.SECOND, 8);
	
		
		System.out.println(ca.getTime().toLocaleString());
	}

}
