package com.itheima.timerx;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timerx {
	public static void main(String[] args) {
	//��ȡ��ǰʱ��
	Date date=	new Date();
	System.out.println("��ǰ��ʱ��Ϊ��"+date.toLocaleString());	
	
	System.out.println("�ӳ�4s��ִ������");
	//��ȡtimer
	Timer time=	new Timer();
	
	//����apiִ������(�ӳ�4000ms��ÿ����1sִ���߳�)
	time.schedule(new TimerTask() {
		
		@Override
		public void run() {
			Date date=	new Date();
			System.out.println(date.toLocaleString());
			
		}
	}, 4000, 1000);
	}
}
