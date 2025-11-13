package org.set;
import java.util.*;
public class SetDemo
{
	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add(10);
		set.add(3);
		set.add(5);
		set.add(7);
		System.out.println(set);
		Iterator<Object> iterator= set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}