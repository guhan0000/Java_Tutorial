package org.passbyreference;

class Box
{
	int length;
	int breath;
	int height;
	
	public Box(int l, int b,int h) {
		length=l;
		breath=b;
		height=h;
		length++;
		
	}
}
public class Main {
	public static void main(String[] args) {
		Box box1=new Box(10, 20, 30);
		System.out.println(box1.length);
		System.out.println(box1.breath);
		System.out.println(box1.height);
	}
}
