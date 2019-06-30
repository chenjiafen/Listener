package com.itheima.bean;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;


/**
 * Serializable 序列化
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

	//钝化(把session中的数据钝化到服务器磁盘上)
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Session 中的bean放入服务器磁盘中");
	}
	
	//活化（从服务器磁盘中把数据读取回session）
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("从服务器磁盘中把数据活化到session中");

	}

}
