package com.gts.functionalinterface;

public class Example1 {
	
	public static void main(String[] args) {
		Calculator calculator=(a,b)->a+b;
		System.out.println(calculator.add(10, 20));
		System.out.println(Calculator.NAME);
		int a=1;
		int b=1;
		boolean positives=Calculator.isPositive(a) && Calculator.isPositive(b);
		if(positives) {
			System.out.println(calculator.sub(a, b));
		}
	}
}
