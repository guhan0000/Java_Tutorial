package org.loops;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String input = "";

	        System.out.println("Type something (type 'exit' to stop):");

	        while (!input.equalsIgnoreCase("exit")) {
	            System.out.print("You: ");
	            input = scanner.nextLine();
	            if (!input.equalsIgnoreCase("exit")) {
	                System.out.println("Echo: " + input);
	            }
	        }
		
	/*	int count=0;
		while(count<5)
		{
			System.out.println(count);
			count++;
		}*/
		//compute();
	}
	static void compute()
	{
		int num=10;
		System.out.println(num++);
		System.out.println(num);
		int num1=9;
		System.out.println(++num1);
		System.out.println(num1++);
		System.out.println(num);
	}

}
