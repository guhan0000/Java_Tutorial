package org.stringprblms;

public class RemoveSpaces {

	public static void main(String[] args) {
		String string="guhan is a great guy";
		String[] split = string.split(" ");
		String string2="";
		for(int i=0;i<split.length;i++)
		{
			string2=string2+split[i];
		}
		System.out.println(string2);
		System.out.println("word count: "+split.length);
	}
}
