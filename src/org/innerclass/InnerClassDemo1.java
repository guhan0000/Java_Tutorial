package org.innerclass;
import java.util.*;
class Outer
{
	int a=3;
	void outerMethod()
	{
		System.out.println("Outer Method");
	}
	class Inner
	{
		int b=5;
		void innerMethod()
		{
			System.out.println("Inner Method");
		}
	}
	class Inner2
	{
		public String inner2method() {
			return("inner method 2");
		}
	}
}

public class InnerClassDemo1 {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.outerMethod();
		Outer.Inner i =o.new Inner();	
		System.out.println(i.b);
		i.innerMethod();
		Outer.Inner2 inner2=o.new Inner2();
		System.out.println(inner2.inner2method());
	}
}
