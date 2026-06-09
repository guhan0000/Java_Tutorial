package com.gts.functionalinterface;

@FunctionalInterface
public interface Calculator {
	String NAME="calculator";
	int add(int a,int b);
	default int sub(int a, int b) {
		return a-b;
	}
	static boolean isPositive(int num) {
		return num>0;
	}
	
}
