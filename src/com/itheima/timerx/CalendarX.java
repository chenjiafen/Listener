package com.itheima.timerx;

import java.util.Calendar;
import java.util.Date;

public class CalendarX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ȡ��������
		Calendar ca = Calendar.getInstance();
		
		//ʹ��ǰ�������������ǰ��ʱ��ͬ��
		ca.setTime(new Date());
		
		//����������
		ca.set(Calendar.YEAR, 2008);
		ca.set(Calendar.MONTH, 8-1);
		ca.set(Calendar.DAY_OF_MONTH, 8);
		
		//����ʱ����
		ca.set(Calendar.HOUR, 8);
		ca.set(Calendar.MINUTE, 8);
		ca.set(Calendar.SECOND, 8);
	
		
		System.out.println(ca.getTime().toLocaleString());
	}

}
