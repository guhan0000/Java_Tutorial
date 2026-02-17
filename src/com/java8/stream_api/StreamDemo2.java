package com.java8.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
	
	public static void main(String[] args) {
		
//		primitive array to stream
		int arr[]= {1,3,5,7,11,5,1,3,5};
		IntStream stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		System.out.println("**********************");
		
//		Object Array to stream
		String bikes[]= {"yamaha","honda","ktm","tvs"};
		Stream<String> bikeStream = Stream.of(bikes);
		bikeStream.forEach(n->System.out.println(n));
		
		System.out.println("****************************");
		
//		Collections (List,..) to stream
		List<Integer>list=Arrays.asList(2,4,6,8,10);
		Integer reduce = list.stream()
		.reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		System.out.println("********************************");
		
// 		converting string to uppercase
		Stream.of(bikes)
			.sorted()
			.map(n->n.toUpperCase())
			.forEach(n->System.out.println(n));
		
		System.out.println("********************************");
//		Flatten the lists [list of lists]
		List<List<String>>couples=Arrays.asList(
				Arrays.asList("Victor","Michele"),
				Arrays.asList("Peter","Jane"),
				Arrays.asList("John","Sara")	
				);
		System.out.println(couples);
		couples.stream()
				.flatMap(name->name.stream())
				.sorted()
				.forEach(name->System.out.println(name));
		System.out.println("*********************************");
//		distinct - remove duplicates
		Arrays.stream(arr)
			  .distinct()
			  .sorted()
			  .forEach(System.out::println);
		System.out.println("************************************");
		
//		peek
		List<Integer> squaredList = Arrays.stream(arr)
			  .distinct()
			  .peek(System.out::println)
			  .sorted()
			  .map(n->n*n)
			  .peek(System.out::println)
			  .boxed()
			  .toList();
		System.out.println(squaredList);
		
		String fruits[]= {"apple","kiwi","cherry","mango"};
		List<String> sortedFruits = Stream.of(fruits)
			  .sorted(Comparator.comparingInt(String::length).reversed())
			  .toList();
		System.out.println(sortedFruits);
		System.out.println("**********************************");
//		skip skip 1st n elements
		sortedFruits.stream()
		.skip(2)
		.forEach(System.out::println);
		
		System.out.println("************************************");
//		limit keep the 1st n elements remove the rest
		sortedFruits.stream()
		.limit(2)
		.forEach(System.out::println);
	}
}
