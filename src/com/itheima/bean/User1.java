package com.itheima.bean;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;


/**
 * Serializable ���л�
 * @author chenjiafeng
 *
 */
public class User1 implements HttpSessionActivationListener,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String passwrod;
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	
	

	public User1(String username, String passwrod) {
		super();
		this.username = username;
		this.passwrod = passwrod;
	}
	
	

	public User1() {

	}

	@Override
	public String toString() {
		return "User1 [username=" + username + ", passwrod=" + passwrod + "]";
	}

	//�ۻ�(��session�е����ݶۻ���������������)
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Session �е�bean���������������");
	}
	
	//����ӷ����������а����ݶ�ȡ��session��
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("�ӷ����������а����ݻ��session��");

	}

}
