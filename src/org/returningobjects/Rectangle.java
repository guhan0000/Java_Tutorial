package org.returningobjects;

public class Rectangle {
	int length;
	int breath;
	public Rectangle()
	{
		
	}
	public Rectangle(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	Rectangle doubleSize()
	{
		Rectangle temp=new Rectangle();
		temp.length=2*this.length;
		temp.breath=2*this.breath;
		return temp;
		
	}
	public static void main(String[] args) {
		Rectangle rect1=new Rectangle(10, 11);
		System.out.println(rect1.length);
		System.out.println(rect1.breath);
		Rectangle rect2=rect1.doubleSize();// here rect2 object stores the reference of temp object, no 
		// rect2 is not created using new kwyword
		System.out.println(rect2.length);
		System.out.println(rect2.breath);
	
	}
}
