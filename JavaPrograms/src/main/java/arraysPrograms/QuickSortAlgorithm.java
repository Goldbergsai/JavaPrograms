package arraysPrograms;

public class QuickSortAlgorithm {

	public static void main(String[] args) {

		int[] a = { 10, 1, 3, 61, 28, 11, 7 };

		quickSort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}

	public static void quickSort(int arr[], int low, int high) {

		if (low < high) {

			int location = partition(arr, low, high);

			quickSort(arr, low, location - 1);

			quickSort(arr, location + 1, high);

		}

	}

	public static int partition(int arr[], int low, int high) {

		int pivot;

		pivot = arr[low];

		int start = low;

		int end = high;

		while (start < end) {
			while (arr[start] <= pivot) {

				start++;
			}

			while (arr[end] > pivot) {

				end--;
			}

			if (start < end) {

				int temp;

				temp = arr[start];

				arr[start] = arr[end];

				arr[end] = temp;

				start++;
				end--;
			}

		}

		int newtemp = arr[low];

		arr[low] = arr[end];
		arr[end] = newtemp;

		return end;
	}

}
