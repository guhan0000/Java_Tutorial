package org.conversions;

public class StringConversions {
	
	public static void main(String[] args) {
		
//		char to String conversions
		
		char ch='G';
		String valueOf = String.valueOf(ch);
		System.out.println(valueOf);
		String string = Character.toString(ch);
		String res=""+ch;
		System.out.println(res);
		String str1=new String(new char[] {ch});
	}

}
