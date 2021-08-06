/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.backend.util;

/**
 *
 * @author Jose Guillermo Yanez
 */

public class Message {
	private boolean error;
	private String text;
	private Object data;
	
	public Message(boolean error, String text, Object data) {
		super();
		this.error = error;
		this.text = text;
		this.data = data;
	}
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}

