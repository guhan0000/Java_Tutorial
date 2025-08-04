package org.constructors;

import javax.naming.event.NamespaceChangeListener;

public class Box {
	 int length;
	 int breath;
	 int height;
	 
	 public Box(int height,int length,int breath)
	 {
		 this.height=height;
		 this.length=length;
		 this.breath=breath;
		 
	 }
	 public Box(Box b)
	 {
//		 length= b.length;
//		 height=b.height;
//		 breath=b.breath;
		 this.length=b.length;
		 this.breath=b.breath;
		 this.height=b.height;
	 }
	 
	 public static void main(String[] args) {
		Box box1=new Box(1,2,4);
		System.out.println(box1.height);
		System.out.println(box1.length);
		System.out.println(box1.breath);
		Box box2=new Box(box1);
		System.out.println(box2.height);
		System.out.println(box2.length);
		System.out.println(box2.breath);
		
	}
}
