package arraysPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MonkAndRotation {

	public static void main(String[] args) {

		

		Set<Integer> set = new HashSet<>();
		
		set.add(6);
		
		set.add(5);
		
		set.add(4);
		
		set.add(5);
		
		set.add(6);
		
		
		TreeSet<Integer> tree = new TreeSet<>(set);

		
		for(Integer s:tree) {
			
			System.out.println(s);
		}
		
		
		
		
		
		

	
	}

}
