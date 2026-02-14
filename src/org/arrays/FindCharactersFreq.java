package org.arrays;

import java.util.HashMap;

public class FindCharactersFreq {
	public static void main(String[] args) {
		String string="Guhan is a good boy";
		string=string.toLowerCase();
		char[] charArray = string.toCharArray();
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		for(int i=0;i<charArray.length;i++)
		{	
			
			if(map.containsKey(charArray[i]))
			{
				if(charArray[i]==' ')
				{
					charArray[i]='*';
				}
				map.put(charArray[i], map.get(charArray[i])+1);
			}
			else {
				map.put(charArray[i], 1);
			}
		}
		
		System.out.println(map);
	}

}
