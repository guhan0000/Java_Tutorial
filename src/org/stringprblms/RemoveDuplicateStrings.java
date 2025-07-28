package org.stringprblms;
import java.util.*;
public class RemoveDuplicateStrings {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		String[] words = string.split("\\s+");
		Set<String> seen=new HashSet<>();
		StringBuilder result=new StringBuilder();
			
		for(String word:words)
		{
			if(!seen.contains(word))
			{
				if(result.length()>0)
				{
					result.append(" ");
				}
				result.append(word);
				seen.add(word);
			}
			
			
		}
		
		
		System.out.println(result.toString());
	}

}
