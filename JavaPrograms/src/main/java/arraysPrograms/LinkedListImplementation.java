package arraysPrograms;

public class LinkedListImplementation {

	static Node head;
	
	public static void print() {
		
		Node temp = head;
		
		while(temp != null) {
			
			System.out.println(temp.data);
			
			temp = temp.next;
			
		}
	}

	public static void add(int element) {

		Node node = new Node(element);
		if (head == null) {

			head = node;
			return;

		}

		Node temp = head;

		/*if (temp.next == null) {

			node = temp.next;

		}*/

		while (temp.next != null) {

			temp = temp.next;

		}
		temp.next = node;

	}

	static class Node {

		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			next = null;

		}

	}

}
