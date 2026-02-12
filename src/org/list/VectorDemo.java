package org.list;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(1);
		vector.add(3);
		vector.add(5);
		System.out.println(vector);
		System.out.println(vector.firstElement());		
	}

}
