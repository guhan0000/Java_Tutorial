package org.patterns;

public class Pattern1 {
	static void pattern1()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
			
		}
	}
	static void pattern2()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void pattern3()
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	static void pattern4()
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern4();
		
	}

}
