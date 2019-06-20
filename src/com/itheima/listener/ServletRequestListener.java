package com.itheima.listener;

import javax.servlet.ServletRequestEvent;

public class ServletRequestListener implements javax.servlet.ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("ServletRequest 销毁了");

	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("ServletRequest 创建了");

	}

}
