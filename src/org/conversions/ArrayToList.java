package org.conversions;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		
		int arr[]= {1,3,5,7};
//		printing primitive arrays
		String arrString = Arrays.toString(arr);
		System.out.println(arrString);
		
//		primitive arrays can't be directly converted into collections 
//		Arrays.asList(arr) -> convert entire array as an object in List.
//		we can achieve with the help of streams
		
		List<Integer> list = Arrays.stream(arr)
			  .boxed()
			  .toList();
		System.out.println(list);
		
	}

}
