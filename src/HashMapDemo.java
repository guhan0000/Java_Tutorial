import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> empid=new HashMap();
//		String string = null;
//		System.out.println(string.length());
		empid.put("Guhan", 681);
		empid.put("Naresh", 685);
		empid.put("Raghul", 684);
		empid.put("Guhan",123);
		empid.put("vasanth", 681);
		// multiple null values allowed
		empid.put("John", null); 
		empid.put("Arthur", null);
		empid.put("Frank", null);
		empid.put(null, 100);
		empid.put(null, 500);
//		one null key allowed
		System.out.println(empid.containsKey("vasanth"));	
		System.out.println(empid.get("Guhan"));
	System.out.println(empid.containsKey("Guhan"));	
	empid.remove("vasanth");
	System.out.println(empid);
	empid.replace("Naresh", 685, 665);
	empid.putIfAbsent("NARESH", 0);
	for(String key :empid.keySet())
	{
		System.out.println(key+empid.get(key));
	}
	
		
		
	}
}
