package arraysPrograms;

public class StackImp {

	private int size;
	private int arr[];
	private int top;

	public int getTop() {
		return top;
	}

	public StackImp(int size) {
		
		
		this.size = size;
		this.arr = new int[size];

		
		this.top = -1;

	}

	

	public void push(int element) {

		if (top < size - 1) {

			top++;
			arr[top] = element;
			System.out.println("Pushed Element-- " + arr[top]);

		} else {

			System.out.println("stack is full");
		}

	}

	public void pop() {

		if (!(top == -1)) {

			int poppedElement = arr[top];
			top--;
			System.out.println("popped out element is --" + poppedElement);
		} else {

			System.out.println("stack is empty");
		}
	}

	public int peek() {

		return arr[top];
	}

}
