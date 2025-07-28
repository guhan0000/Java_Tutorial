package org.patterns;

public class Pattern5 {
public static void main(String[] args) {
	int n=5;
	int star=n-1;
	int space=n-1;
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<star;j++)
	    {
	        System.out.print("*");
	    }
	    for(int k=0;k<space;k++)
	    {
	        System.out.print(" ");
	        
	    }
	    System.out.println();
	    space++;
	    star--;
	}
}
}
