package collectionWithGenerics.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1
{
	public static void main(String[] args) 
	{
		
		Map<String,Integer>map=new HashMap<>();
		map.put("anup",40);
		map.put("avad",23);
		map.put("abhi",12);
		map.put("Anil",99);	

		Set<String>KeySet=map.keySet();
		System.out.println("keys:-"+KeySet);

		Collection<Integer>values=map.values();

		System.out.println("Values:-"+values);

		for(String key: KeySet)
		{
			System.out.println("key:-"+key+"values:-"+map.get(key));
		}
	}
}