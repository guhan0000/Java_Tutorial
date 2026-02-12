package org.set;
import java.util.*;
public class SetDemo
{
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(3);
		set.add(5);
		set.add(7);
		System.out.println(set);
		System.out.println(set.first());
		Iterator<Object> iterator= set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		LinkedHashSet<String>bikeSet=new LinkedHashSet<String>();
		bikeSet.add("unicorn");
		bikeSet.add("activa");
		bikeSet.add("pleasure");
		bikeSet.add("XL 100");
		System.out.println(bikeSet);
		
		Iterator<String> iterator2 = bikeSet.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}
}