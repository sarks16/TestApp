package com.sonal.helloworld;

public class WelcomeBean {

	private String message;

	public WelcomeBean(String message) {
		this.message = message;
	}

	/*
	 * public void setMessage(String message) { this.message = message; }
	 */

	public void show() {
		System.out.println("the message is : " + message);
	}

}
