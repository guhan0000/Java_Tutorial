package com.java8;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoinerDemo {
public static void main(String[] args) {
	StringJoiner joiner=new StringJoiner("$");
	joiner.add("Anthony");
	joiner.add("Edward");
	joiner.add("Stark");
	System.out.println(joiner);
	String name=joiner.toString();
	System.out.println(name);
	String[] split = name.split("\\$");
//	System.out.println(Arrays.asList(split));
	System.out.println(split.length);
	for(String str:split) {
		System.out.println(str);
	}
}
}
