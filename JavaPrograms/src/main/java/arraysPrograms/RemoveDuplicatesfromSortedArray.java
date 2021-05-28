package arraysPrograms;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 7, 9 };
		int n = arr.length - 1;

		int length = removeDuplicatesUsingConstantSpace(arr, n);

		System.out.println("index length " + length);

		print(arr, length);

	}

	public static int removeDuplicatesUsingConstantSpace(int arr[], int n) {

		int j = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] != arr[i + 1]) {

				arr[j] = arr[i];
				j++;
			}

		}
		arr[j] = arr[n];

		return j;

	}

	public static void print(int arr[], int n) {

		for (int k = 0; k <= n; k++) {

			System.out.println(arr[k]);

		}

	}

}
