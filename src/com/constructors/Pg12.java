package com.constructors;
class Box
{
int l;
int b;
int h;
public Box(int x,int y,int z) //formal parameters behave like local variables of a method
{
l = x;
b = y;
h = z;
}
public Box()
{
l = 0;
b = 0;
h = 0;
}
public void display()
{
if(l==0)
System.out.println("no box");
else
System.out.println("the dimensions of the box are "+l+","+b+","+h);
}
}

public class Pg12 {
	public static void main(String args[])
	{
	Box obj = new Box(10,20,30);// i am calling the parameterized constructor.
	obj.display();
	Box c1 = new Box();// i am calling the default constructor.
	c1.display();
	c1 = obj;
	c1.display();
	}

}
