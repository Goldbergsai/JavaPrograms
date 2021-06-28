package arraysPrograms;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTablePrac {

	public static void main(String[] args) {
		
		
		Hashtable<String,String> h = new Hashtable<>();
		
		
		
		h.put("A", "Apple");
		h.put("a", "Apple");
		h.put("C", "Apple");
		h.put("D", "Apple");
		
		 Enumeration<String> e = h.elements();
		 
		 while(e.hasMoreElements()) {
			 
			 System.out.println(e.nextElement());
			 
		 }
		
		
		Set s = h.entrySet();
		
		
		System.out.println(s);
	}

}
