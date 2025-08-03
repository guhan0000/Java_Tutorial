package org.typecasting;

public class Test {
	int sum=10895;
	
	public static void main(String[] args) {
		int i=2599;
		int a=5;
		int b=10;
		float a1=10;
		float b1=4;
		float res1=a1/b1;
		float res=a/b;// takes only the integer part and ignores the decimal part prints only 0 and ignores .2
		System.out.println(a/b);
		System.out.println(res);//convert the result into float but integer division is performed
		System.out.println(a1/b1);
		System.out.println(res1);
		System.out.println((float)a/(float)b);// perform float division explicit conversion 
		int s=4;
		System.out.println((float)s);
		System.out.println(i);
		System.out.println(new Test().sum);
		
		
	}

}
