package org.looptasks;

public class Armstrong {
	static int countDigits(int num)
	{
		int res=0,rem=0;
		int count=0;
		while(num!=0)
		{
			res=num%10;
			num/=10;
			count++;
			
			
		}
		return count;
	}
	static int compute(int count,int num)
	{
		int sum=0;
		int res=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			sum=(int) (sum+(Math.pow(rem, count)));
			num/=10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		//System.out.println(countDigits(1000));
		int num=407;
		//System.out.println(compute(3,153));
		if(num==compute(countDigits(num),num))
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}
