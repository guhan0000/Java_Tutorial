package org.stringprblms;
import java.util.*;
public class VowelOrConsonent {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		char ca[]= {'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i<ca.length;i++)
		{
			if(ca[i]==ch)
			{
				System.out.println("vowel");
				break;
			}
			else
			{
				System.out.println("consonent");
				break;
			}
		}
		
	}
	

}
