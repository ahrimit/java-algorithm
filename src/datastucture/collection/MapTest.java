package datastucture.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class MapTest {
	
	@Test
	public void basicFucntionTest(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("B", "b1");
		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.getOrDefault("C", "default"));
		
		map.replace("A", "a", "a1");
		System.out.println(map);
		
		map.remove("A", "a");
		System.out.println(map);

		map.remove("A");
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
	
	@Test
	public void searchTest(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		
		//1. entry set
		Set<Map.Entry<String, String>> entrySet =  map.entrySet();
		for(Map.Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		//2. ketSet
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + "=" + map.get(key));
		}
		
		//3. iterator
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + "=" + entry.getKey());
		}
	}
	
}
