package com.java8.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInterviewTasks {
	
	public static void main(String[] args) {
//	1.	even nos
		int arr[]= {1,2,3,4,5};
		Arrays.stream(arr).filter(n->n%2==0).forEach(n->System.out.println(n));
		
//		2. squared nos
		List<Integer> nums =
		        Arrays.asList(1,2,2,3,3,4,5);
		List<Integer> squaredNums = nums.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(squaredNums);
		
//		3. sum of all nums
		Integer sum = nums.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
//		4. find maxNum
		Optional<Integer> max = nums.stream().max((a,b)->Integer.compare(a, b));
		System.out.println(max.get());
		Integer min = nums.stream().min(Integer::compare).get();
		System.out.println(min);
		
//		5 count elements
		long count = nums.stream().count();
		System.out.println(count);
		
//		sort asc
		Stream<Integer> sorted = nums.stream().sorted();
		List<Integer> list = sorted.toList();
		System.out.println(list);

//		sort desc
		List<Integer> desc = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);
//		remove dups
		nums.stream().distinct().forEach(System.out::println);
		
//		secondMax
		  Optional<Integer> max2 = nums.stream().sorted(Comparator.reverseOrder()).skip(1).max((a,b)->Integer.compare(a, b));
		  System.out.println("second max"+max2.get());
	}
	
	

	

}
