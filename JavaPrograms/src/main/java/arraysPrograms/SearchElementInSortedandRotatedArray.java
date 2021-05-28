package arraysPrograms;

public class SearchElementInSortedandRotatedArray {

	public static void main(String[] args) {

		int[] arr = { 15, 16, 27, 38, 49, 5, 10, 12, 14 };

		int pivotvalue = findPivotElementUsingBinarySearch(arr, 0, arr.length - 1);

		System.out.println("pivot value :" + pivotvalue);

	}

	public static int findPivotElement(int arr[]) {

		int min = arr[0];

		int pivot;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] < min) {

				pivot = arr[i];
				return pivot;
			}

		}
		return -1;

	}

	public static int findPivotElement1(int arr[]) {

		int min = arr[0];

		int pivot;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {

				pivot = arr[i + 1];
				return pivot;
			}

		}
		return -1;

	}

	public static int findPivotElementUsingBinarySearch(int arr[], int start, int end) {

		int mid = (start + end) / 2;

		int pivot;

		if (arr[mid] > arr[mid + 1]) {

			pivot = arr[mid + 1];

			return pivot;
		} else {

			if (arr[start] > arr[mid]) {

				return findPivotElementUsingBinarySearch(arr, start, mid - 1);

			} else {
				return findPivotElementUsingBinarySearch(arr, mid + 1, end);

			}

		}

	}
	public static int findPivotIndexUsingBinarySearch(int arr[], int start, int end) {

		int mid = (start + end) / 2;

		int pivot;

		if (arr[mid] > arr[mid + 1]) {

			pivot = mid + 1;

			return pivot;
		} else {

			if (arr[start] > arr[mid]) {

				return findPivotElementUsingBinarySearch(arr, start, mid - 1);

			} else {
				return findPivotElementUsingBinarySearch(arr, mid + 1, end);

			}

		}

	}

	public static void binarySearch(int arr[], int start, int end, int searchValue) {

	}

	public static int findPivotPoint(int arr[]) {

		int pivot;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] < arr[i + 1]) {

				pivot = arr[i + 1];

				return pivot;

			}

		}
		return -1;

	}

	public static int pivotBinarySearch(int arr[], int start, int end, int searchValue) {
		return searchValue;

	}

	public static int binarySearchArray(int arr[], int start, int end, int searchValue) {

		int mid = (start + end) / 2;

		while (start < end) {

			if (arr[mid] == searchValue) {

				System.out.println("values is present at index :" + mid + " value is :" + arr[mid]);

				return arr[mid];

			} else if (arr[mid] < searchValue) {

//				return binarySearchArray(arr, start, mid -1, searchValue);

				 mid =mid +1;

			} else {

//				return binarySearchArray(arr, start, end = mid - 1, searchValue);
//
				 mid =mid -1;
			}

//		}
		

	}
		return -1;

}}
