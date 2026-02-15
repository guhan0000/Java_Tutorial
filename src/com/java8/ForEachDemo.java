package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
		public static void main(String[] args) {
			List<String>bikes=Arrays.asList("Honda","TVS","Suzuki","Yamaha");
			
			// forEach using Anonymous Inner Class
			
//			Consumer<String> consumer=new Consumer<String>() {
//				
//				@Override
//				public void accept(String t) {
//					// TODO Auto-generated method stub
//					System.out.println(t);
//					
//				}
//			};
			bikes.forEach(new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
			});
			// forEach using Lamda Exprns
			
			bikes.forEach(n->System.out.print(n+" "));
		}

}
