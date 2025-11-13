package org.list;

import java.util.*;

public class ArrayListDemi {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("guhan");
		list.add(31);
		list.add(true);
		Object object = list.get(0);
//		System.out.println(object);
//		int arr[]= {1,2,3,4};
		list.add(0, "kavi");
		list.set(0, "m");
		list.add(0, "kavi");
		list.remove(0);
		list.remove("guhan");
		list.add(3, 0.42);
		list.add(true);
//		list.clear();
		System.out.println(list);
//		System.out.println(list.contains(31));
		System.out.println(list.indexOf(true));
		System.out.println(list.lastIndexOf(true));
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		Iterator iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"");;
			
			
		}
		System.out.println();
		
		List list2=Arrays.asList(1,2,2,3,4,3,5);
		System.out.println(list2);
//		list2.remove();
//		System.out.println(list2);
		
//		System.out.println(list2.lastIndexOf(2));
		List list3= Arrays.asList(1,2,3);
//		list2.retainAll(list3);
		System.out.println(list2);
//		System.out.println(list3);
		boolean equals = list3.equals(list2);
		System.out.println(equals);

		
	}

}
