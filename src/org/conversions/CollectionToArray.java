package org.conversions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArray {
	
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,3,5,7);
		
//		using toArray -> converts a collection to array of Object Type
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
//		toArray with specific type
		Integer[] array2 = list.toArray(new Integer[0]);
//		using streams
		int[] array3 = list.stream()
			.mapToInt(n->n.intValue())
			.toArray();
		
		System.out.println(Arrays.toString(array3));
	}

}
