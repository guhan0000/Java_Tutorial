package org.typecasting;

public class TypeCastEx2 {
	public static void main(String[] args) {
		int a=34;
		float b;
		b=a;
		int c=5;
		float d=2.3f;
		c=(int)d;
		System.out.println(b);
		System.out.println(c);
		byte b2=2;
		int a1=5;
		System.out.println((byte)a1);
		String string="food";
		char ch=string.charAt(0);
		System.out.println(ch);
		StringBuilder stringBuilder=new StringBuilder(string);
		System.out.println(stringBuilder.lastIndexOf("o"));
		
	}

}
