package org.passbyvalue;

public class Main {
	
	private static void increment(int a) {
		// TODO Auto-generated method stub
		a++;
		System.out.println(a);
	
	}
	
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		increment(a);
		increment(a);
		System.out.println(a);
	}

}
