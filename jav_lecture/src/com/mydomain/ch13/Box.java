package com.mydomain.ch13;

public class Box {
	private Object object = new Object();
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}
