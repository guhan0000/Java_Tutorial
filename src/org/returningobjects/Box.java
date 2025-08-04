package org.returningobjects;

public class Box {
	int length;
	int breath;
	int height;
	public Box(int length,int breath,int height)
	{
		this.length=length;
		this.breath=breath;
		this.height=height;
	}
	 Box doubleBoxSize(Box b) {
		b.length=2*this.length;
		b.breath=2*this.breath;
		b.height=2*this.height;
		return b;
		 
	}
	
	public static void main(String[] args) {
		Box box1=new Box(10, 20, 30);
		System.out.println(box1.length);
		System.out.println(box1.breath);
		System.out.println(box1.height);
		box1.doubleBoxSize(box1);
		System.out.println(box1.length);
		System.out.println(box1.breath);
		System.out.println(box1.height);
		
		
	}

}
