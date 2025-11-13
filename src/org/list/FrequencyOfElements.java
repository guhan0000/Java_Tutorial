package org.list;
import java.util.*;

public class FrequencyOfElements {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("ram", "ram", "guhan", "abi", "abi");
		Map<String, Integer>map=new HashMap<String, Integer>();
		for(String name:names)
		{
			if(map.containsKey(name))
			{
				map.put(name, map.get(name)+1);
				
			}
			else {
				map.put(name, 1);
			}
		}
		System.out.println(map);
		
		
	}

}
