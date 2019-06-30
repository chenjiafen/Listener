package com.itheima.attr;



import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttrListener implements ServletContextAttributeListener	 {
	
	
	/**
	 * 
	 */



	//添加
	@Override
	public void attributeAdded(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("ServleteContext 属性添加了"+scab.getName()+":"+scab.getValue());

	}
	
	//移除
	@Override
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext 属性移除了"+scab.getName()+":"+scab.getValue());
		
	}
	
	
	//替换
	@Override
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext 属性替换了"+scab.getName()+":"+scab.getValue());

	}

}
