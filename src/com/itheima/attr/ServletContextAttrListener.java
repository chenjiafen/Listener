package com.itheima.attr;



import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttrListener implements ServletContextAttributeListener	 {
	
	
	/**
	 * 
	 */



	//���
	@Override
	public void attributeAdded(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("ServleteContext ���������"+scab.getName()+":"+scab.getValue());

	}
	
	//�Ƴ�
	@Override
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext �����Ƴ���"+scab.getName()+":"+scab.getValue());
		
	}
	
	
	//�滻
	@Override
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext �����滻��"+scab.getName()+":"+scab.getValue());

	}

}
