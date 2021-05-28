package arraysPrograms;

public class ReversalAlgorithm {

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		leftRotate(arr, 2);
		printArray(arr);

	}

	public static void leftRotate(int arr[], int d) {

		int n = arr.length;

		reverseAnArray(arr, 0, d - 1);

		reverseAnArray(arr, d, n - 1);

		reverseAnArray(arr, 0, n - 1);

	}

	public static void reverseAnArray(int arr[], int start, int end) {

		int temp;

		while (start < end) {

			temp = arr[start];

			arr[start] = arr[end];

			arr[end] = temp;

			start++;
			end--;

		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
