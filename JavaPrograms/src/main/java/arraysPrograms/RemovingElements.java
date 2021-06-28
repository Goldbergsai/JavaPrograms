package arraysPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemovingElements {

	public static void main(String[] args) {
		
		ArrayList<String> arrlist = new ArrayList<>();
		
		arrlist.add("one");
		arrlist.add("two");
		arrlist.add("three");
		arrlist.add("four");
		
		
		
		
		  Map<String, String> map = new HashMap<>();
		  
		  map.put("A", "Apple");
		  map.put("B", "Ball");
		  map.put(null, "Cat");
		  
		  map.put("B", "Batman");
		  map.put("B", "Balls");
		  map.put(null, "Cats");
		  
		  
		Set<Entry<String, String>> entrys = (Set<Entry<String, String>>) map.entrySet().iterator();
		
		
		Iterator<Entry<String, String>> itr = entrys.iterator();
		
		
		
		while(itr.hasNext()) {

			
		Entry<String, String> itrNext = itr.next();
			System.out.println(itr.next());
			
			itrNext.getValue();
			itrNext.getKey();
			
		
		}
		

	}

	

}
