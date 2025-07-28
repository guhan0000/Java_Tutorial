package org.patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int n=5;
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//System.exit(0);
	}
}
