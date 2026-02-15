package com.java8.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(11,5,1,3,7,8,2,6,4);
		list.stream()
			.sorted()
			.forEach(n->System.out.println(n));
		System.out.println("**********************");
		
//		doubles values
		list.stream()
			.sorted()
			.map(n->n*2)
			.forEach(n->System.out.println(n));
		System.out.println("*******************");
//		filers only even values
		list.stream()
			.sorted()
			.filter(n->n%2==0)
			.forEach(n->System.out.println(n));
		System.out.println("*******************");
//		reduce the values (sum of even list values)
		Integer reduce = list.stream()
			.filter(n->n%2==0)
			.reduce(0,(n1,n2)->n1+n2);
		System.out.println(reduce);
		
	}

}
