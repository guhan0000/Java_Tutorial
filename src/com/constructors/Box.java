package com.constructors;
import java.util.*;
public class Box {
	int l;
	int b;
	int h;
	public Box()
	{
		l=0;
		b=0;
		h=0;
	}
	public Box(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	void display()
	{
		if(l==0)
		{
			System.out.println("No Box");
		}
		else
		{
			System.out.println("Area "+l*b*h);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Box ob1=new Box();
		Box ob2=new Box(a,b,c);
		ob1.display();
		ob2.display();
		ob2=ob1;
		ob2.display();
		
	}
	

}
