package org.polynew;

public class MethodOverloading {
	public int add(int a,int b)
	{
		System.out.println("1 method");
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		System.out.println("2 method");
		return a+b+c;
	}
	
	public double add(double a1,double b1,double c1)
	{
		System.out.println("3 method");
		return a1+b1+c1;
	}
	public String add(String a,int b)
	{
		System.out.println("4th method");
		return a+b;
		
	}
	public String add(int a,String b)
	{
		System.out.println("5th method");
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.add("10",12));
		System.out.println(mo.add(10,"12"));
	}

}
