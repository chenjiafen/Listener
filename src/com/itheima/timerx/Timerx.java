package com.itheima.timerx;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timerx {
	public static void main(String[] args) {
	//获取当前时间
	Date date=	new Date();
	System.out.println("当前的时间为："+date.toLocaleString());	
	
	System.out.println("延迟4s后，执行任务");
	//获取timer
	Timer time=	new Timer();
	
	//调用api执行任务(延迟4000ms，每经过1s执行线程)
	time.schedule(new TimerTask() {
		
		@Override
		public void run() {
			Date date=	new Date();
			System.out.println(date.toLocaleString());
			
		}
	}, 4000, 1000);
	}
}
