package collection;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Collection;

public class MapDemo {

	public static void main(String[] args) {

		
		Map<String,Integer> map=new TreeMap<>();
		
		map.put("John", 30);
		map.put("Tom", 20);
		map.put("Lee", 18);
		map.put("Brad", 21);
		
		Set<String> keyset=map.keySet();
		
		System.out.println("Keyset: "+keyset);
		
		Collection<Integer> values=map.values();
		
		System.out.println("Values: "+values);
		
		for(String key:keyset) {
			System.out.println("Key: " +key+ " Value: "+map.get(key));
		}
	}

}
