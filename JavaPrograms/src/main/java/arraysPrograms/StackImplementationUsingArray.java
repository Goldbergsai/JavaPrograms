package arraysPrograms;

public class StackImplementationUsingArray {

	static int topIndex = -1;

	public static int arrray[];
	public static int size;

	public StackImplementationUsingArray(int size) {

		this.size = size;
		arrray = new int[size];
	}

	public static void printArray() {

		for (int arr : arrray) {

			System.out.println(arr);
		}
	}

	public static void push(int addElement) {

		if (topIndex < size - 1) {

			arrray[topIndex + 1] = addElement;

			System.out.println("Elelment added into Stack successfully");
			topIndex++;
		} else {

			System.out.println("Stack is full");

		}
	}

	
	public static void peek() {
		
		System.out.println(arrray[topIndex]);
		
	}
	public static void pop() {
		int poppedOut = 0;
		if (topIndex >= 0) {

			poppedOut = arrray[topIndex];
			topIndex--;
			System.out.println(poppedOut);

		}else {
			
			System.out.println("Stack is empty");
		}
		

	}

}
