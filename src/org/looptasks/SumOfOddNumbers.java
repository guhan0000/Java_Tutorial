package org.looptasks;

public class SumOfOddNumbers {
	
	public static void main(String[] args) {
		int sum=0,count=0;
		for(int i=1;i<=100;i++)
		{
			if((i%2==0))
			{
				count++;
			}
			else
			{
				sum+=i;
			}
		}
		System.out.println("Sum of Odd Numbers:"+sum+"\n"+"Count of Even Numbers:"+count);
	}

}
