package sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapPracrice {
	public static void main(String[] args) {
		Map m=new HashMap<>();
		m.put(1, "hii");
		m.put(2, "hello");
		m.put(3, "hey");
		m.put(4, "hoy");
		
		Set s= m.keySet();
		for (Object object : s) {
			System.out.println(object);
		}
		
		Collection c=m.values();
		for (Object object : c) {
			System.out.println(object);
		}
		
	//	for(Entry e=m.entrySet()) {
			
		//}
	}
}
