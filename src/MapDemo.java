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
		

	}

}
