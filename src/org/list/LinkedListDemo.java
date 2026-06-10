package org.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Integer>list=new LinkedList<Integer>();
		list.add(10);
		List<Integer>list2=new LinkedList<Integer>();
		list2.add(10);
		list2.add(20);
		boolean b = list.add(20);
		boolean equals = list.equals(list2);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(equals);
		
	}

}
