package com.constructors;

public class Calculator {
	int x;
	int y;
	int z;
	
	public Calculator()
	{
		System.out.println("default Constructor");
		x=10;
		y=5;
	}
	public Calculator(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("Parameterized Constructor "+x*y);
		
	}
	public Calculator(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
		System.out.println("Parameterized Constructor "+x*y/z);
		
	}
	private int add() {
		// TODO Auto-generated method stub
		return x+y;

	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add());
		Calculator c1=new Calculator(10,1);
		
		
		
	}

}
