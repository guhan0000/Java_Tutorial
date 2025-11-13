package org.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateSet {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
		Set<Integer>set=new TreeSet<Integer>(list);
		List<Integer>result=new ArrayList<Integer>(set);
		System.out.println(result);
		
	}

}
