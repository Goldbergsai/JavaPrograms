package arraysPrograms;

public class RotateAnArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		rotateArray(array, 2, 5);
		printArray(array, 5);

	}

	public static void rotateArray(int arr[], int d, int n) {

		for (int i = 0; i < d; i++) {
			rotateByone(arr, n);
		}
	}

	public static void rotateByone(int arr[], int n) {

		int i;
		int temp;

		temp = arr[0];

		for (i = 0; i < 4; i++)
			arr[i] = arr[i + 1];

		// System.out.print(arr[i]);

		arr[n - 1] = temp;
		// System.out.println("array arr[4]" + arr[n - 1]);

	}

	public static void printArray(int arr[], int n) {

		for (int i = 0; i < n; i++) {

			System.out.print(arr[i]);

		}
	}

}
