package org.list;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
		List<Integer>result=new ArrayList<Integer>();
		List<Integer>dups=new ArrayList<Integer>();
		// Output → [1,2,3,4,5]
		for(int i=0;i<list.size();i++)
		{
			if(!result.contains(list.get(i)))
			{
				
				result.add(list.get(i));
			}
		}
		System.out.println(result);
		
		
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.indexOf(list.get(i))==list.lastIndexOf(list.get(i)))
//			{
//				result.add(list.get(i));
//
//				
//			}
//			
//		}
//		System.out.println(result);
//		System.out.println(dups);
		

	}
}
