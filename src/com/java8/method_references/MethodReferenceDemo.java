package com.java8.method_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,3,5,7,11);
		System.out.println(list);
		
//		creating consumer obj
		Consumer<Integer>consumer=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		list.forEach(consumer);
		System.out.println("***************");
//		using lambda expressions
		list.forEach(n->System.out.println(n));
		
		System.out.println("********************");
//		using method references
		list.forEach(System.out::println);
		System.out.println("*******************");
		List<String>cars=Arrays.asList("hyundai","suzuki","tata","honda");
		cars.stream()
			.map(String::length)
			.forEach(System.out::println);
	
		
	}

}
