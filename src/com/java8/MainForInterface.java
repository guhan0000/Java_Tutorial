package com.java8;

public class MainForInterface implements JavaEightInterface {
	public static void main(String[] args) {
		JavaEightInterface obj=new MainForInterface();
		obj.greet();
		System.out.println(JavaEightInterface.getDateTime());
	}

}
