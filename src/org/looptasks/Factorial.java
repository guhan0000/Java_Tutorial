package org.looptasks;


public class Factorial {
	public static void main(String[] args) {
		
		
		int num=5;
		int res=1;
		
		if(num==0)
		{
			System.out.println(res);
		}
		else if(num<0)
		{
			System.out.println("Not possible");
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				res=(res*i);
			}
			System.out.println(res);
		}
		
		
	}
}
