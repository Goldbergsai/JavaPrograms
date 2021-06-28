package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionImp {

	public static void main(String[] args) {
		
		
	   Hashtable< String, String> ht = new Hashtable<>();
	   
	   
	   int  [] sai = {1, 2,3 , 1 ,2};
	   
	       List<int[]> coll = Arrays.asList(sai);
	     
	     Set set = new HashSet<>(Arrays.asList(sai));
	     
	     
	      Object[] unqset = set.toArray();
	     
	     for(Object s : unqset) {
	    	  String ff =  s.toString();
	    	 
	    	System.out.println(ff); 
	     }
	     
	     
	   ht.put("sai", "op");
		
		Collection<String> arrList = new ArrayList<>();
	
		arrList.add("one");
		arrList.add("two");
		arrList.add("one");
		arrList.add("two");
		arrList.add("one");
		arrList.add("two");
		arrList.add("one");
		arrList.add("two");
		
		System.out.println(arrList);
		
	 Iterator<String> itr = arrList.iterator();
	 
	 
	 while(itr.hasNext()) {
		 
		 System.out.println(itr.next());
	 }
	 
	 
	 
		
		
	}

}
