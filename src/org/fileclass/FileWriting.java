package org.fileclass;
import java.io.*;
import java.util.Scanner;

public class FileWriting {
	 static void compute(String str) throws IOException {
		// TODO Auto-generated method stub
		String rev="";
		new File("D:/GUHAN_PRGMR").mkdirs();
		BufferedWriter writer = new BufferedWriter(new FileWriter("D:/GUHAN_PRGMR/guhan.txt"));
		writer.write("Output");
		writer.newLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(str+" is a palindrome");
			writer.write(str+" is a palindrome");
			writer.close();
			
		}
		else
		{
			System.out.println(str+" is not a palindrome");
			writer.write(str+" is not a palindrome");		
			writer.close();
		}
	}
	public static void main(String[] args) throws IOException {
		//BufferedWriter writer=new BufferedWriter();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		compute(str);
		
		
		
		
		
		
	}
	

}
