package arraysPrograms;

import java.util.LinkedList;

public class StackImplementUsingLinkedList<E> {

	
	public static  LinkedList<Integer> lList ;
	
	
	public StackImplementUsingLinkedList() {
		
	this.lList = new LinkedList<>();
		
		
	}
	
	
	public static void push(int element) {
		
		lList.add(element);
		
		
		System.out.println(element);
		
	}
	
	
	public static void pop() {
		if(!lList.isEmpty()) {
			int removed =lList.removeLast();
			System.out.println(removed);
		}
		else {
			
			System.out.println("Stack is empty");
		}
	
		
		
	}
	
	
}
