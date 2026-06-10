import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> map=new TreeMap<String, Object>();
		map.put("id", "kavi");
		map.put("fname", "kavi");
		map.put("age", "kavi");
		map.put("fname", null);
		
		System.out.println(map);
		boolean containsValue = map.containsValue(null);
		System.out.println(containsValue);
		for(String string:map.keySet())
		{
			System.out.println(map.get(string));
		}
		for(Object values:map.values())
		{
			System.out.print(values+" ");
		}
		
		Map<Integer, String> map2=new Hashtable<>();
		map2.put(1, "guhan");
		map2.put(2, "naresh");
//		map2.put(null, null); not allowed
//		map2.put(3, null); not allowed
//		map2.put(null, "raghul"); not allowed
//		no null key and value allowed
		System.out.println(map2);
	}

}
