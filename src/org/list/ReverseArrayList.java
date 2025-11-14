package org.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list=Arrays.asList(1,3,5,7,9,11);
		List<Integer>result=new ArrayList<Integer>();
		for(int i=list.size()-1;i>=0;i--)
		{
			result.add(list.get(i));
		}
		System.out.println(result);
	}

}
