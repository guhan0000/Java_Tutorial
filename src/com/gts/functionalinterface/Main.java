package com.gts.functionalinterface;

public class Main {
	
	Calculator calculator =new Calculator() {
		
		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("this is an example for functional interfacee");
			return a+b;
		}
	};
	public static void main(String[] args) {
	Main main=new Main();
	System.out.println(main.calculator.add(10, 20));
//	creates a new anonymous innerclass
	Calculator calculator2 = new Calculator() {
		
		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	};
	System.out.println(calculator2.add(0, 0));
//	lamda exprsn
//	dont create new anonymous class
	
	Calculator calculator3=(a,b)->a+b;
	System.out.println(calculator3.add(100, 200));
	}
}
