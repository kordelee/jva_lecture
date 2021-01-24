package com.mydomain.ch13;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("lhlkjhl");
		String name = (String) box.get();
		System.out.println(name);
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
