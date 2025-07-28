package org.loops;
import java.util.*;

public class WhileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input="";
		while(!input.equalsIgnoreCase("exit"))
		{
			System.out.println("Enter input");
			input=sc.next();
			System.out.println(input);
		}
		System.out.println("loop is terminated");

	}

}
