package org.objectpassing;
class Box{
	int h;
	int l;
	int b;

	public Box()
	{
		h=10;
		l=20;
		b=30;
	}
	public Box(int h,int l,int b)
	{
		this.b=b;
		this.l=l;
		this.b=b;
	}
	public Box(Box bx)// copy constructor
	{
		l=bx.l;
		b=bx.b;
		h=bx.h;
		
	}
	 void printdim(Box b)
	{
		System.out.println(l);
		System.out.println(b.l);
	}
}


public class Exam2 {
	public static void main(String[] args) {
		Box b1=new Box(1, 2, 3);
		Box b2=new Box(4, 5, 6);
		Box box=new Box();
		b1.printdim(b2);// 20 because it prints the length of invoked obhect
		// here invoked object box is initialized in the constructor
		//2 will be printed next for b.l
		b1.printdim(b1);
		box.printdim(b1);
		Box b3=new Box(b2);
		box.printdim(b3);
		
		
		
	}

}
