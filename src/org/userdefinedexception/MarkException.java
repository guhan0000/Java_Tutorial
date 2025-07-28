package org.userdefinedexception;

import java.util.Scanner;

public class MarkException extends Exception {
	public MarkException() {
		// TODO Auto-generated constructor stub
		super("Mark b/w 0-100");
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try
		{
			int mark=scanner.nextInt();
			if(mark>=0 && mark<=100)
			{
				System.out.println("valid mark");
			}
			else
			{
				throw new MarkException();
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
	
