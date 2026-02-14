package com.java8l.lamdaexprns;

interface Square{
	int calculateSquare(int num);
}
interface Subraction{
	void difference(int a,int b);
	
}

public class Calculator {
	public static void main(String[] args) {
		Addition addition=(a,b)->a+b;
		System.out.println(addition.add(10, 1));
		Square square=x->x*x;
		System.out.println(square.calculateSquare(5));
		Subraction subraction=(a,b)->{
			System.out.println("the result of"+a + "-"+b+" is"+(a-b));
		};
		subraction.difference(10, 20);
	}

}
