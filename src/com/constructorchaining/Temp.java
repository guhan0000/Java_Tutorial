package com.constructorchaining;

public class Temp {
	
	static int x=10;
	static int x1=2;
	static int x2=4;
	
	public Temp(int x)
	{
		this(x1,x2);
		System.out.println("Parameterized int "+x);
	}
	public Temp(String str)
	{
		this(x);
		System.out.println("String "+str);
	}
	public Temp(int x,int y)
	{
		this();
		System.out.println("x*y"+x*y);
	}
	public Temp()
	{

		System.out.println("this is default constructor");
	}
	public static void main(String[] args) {
		String name="guhan";
		new Temp(name);
	}
}
