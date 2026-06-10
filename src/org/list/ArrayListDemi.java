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
//		revision on feb12 26
		System.out.println("*****************************************\n");
//		CREATE
		List<String> cars=new ArrayList<String>();
		
		cars.add("baleno");
		cars.add("creta");
		cars.add("fortuner");
		cars.add("ertiga");
		cars.add("baleno");
		System.out.println(cars.indexOf("baleno"));//0
		System.out.println(cars.lastIndexOf("baleno"));//4
		System.out.println(cars);
		
//		READ
		String car0 = cars.get(0);
		System.out.println(car0);//[baleno, creta, fortuner]
		
//		UPDATE
		cars.add(0,"innova");// value in 0th index moved to 1st
		System.out.println(cars);//[innova, baleno, creta, fortuner]
		cars.set(0, "Swift");// value in 0th index is replaced by Swift
		System.out.println(cars);// [Swift, baleno, creta, fortuner]
		
//		DELETE
		cars.remove(0);// remove using index
		System.out.println(cars);// [baleno, creta, fortuner]
		cars.remove("baleno"); //removes using objects
		System.out.println(cars);// [creta, fortuner]
// 		cars.clear(); // empties the list
		System.out.println(cars);// []
		boolean empty = cars.isEmpty();
		System.out.println(empty);
		
		List<String>seats=new ArrayList<String>();
		seats.add("5");
		seats.add("7");
		cars.addAll(0,seats);// add at 0th index
		System.out.println(cars);
		cars.addAll(seats);// append to the end of the list
		System.out.println(cars);// [creta, fortuner, 5, 7]
		System.out.println(seats);//[5, 7]
		boolean containsAll = cars.containsAll(seats);
		System.out.println(containsAll);// true
		cars.removeAll(seats); // removes all the seat objects in cars
		System.out.println(cars);//[creta, fortuner]
		Collections.reverse(cars);
		System.out.println(cars);
		String max = Collections.max(cars);
		System.out.println(max);
		List<String> cars2=Arrays.asList("baleno");
//		boolean retainAll = cars.retainAll(cars2);
		System.out.println(cars);
		Iterator<String> iterator2=cars.iterator();
		while (iterator2.hasNext()) {
			if(iterator2.next().equals("ertiga")) {
				iterator2.remove();
			}
			
		}
//		for(String car:cars) {
//			if(car.equals("ertiga")) {
//				
//			}
//				
//		}
		System.out.println(cars);
		
		Comparable<>;
		Comparator<T>
	}

}
