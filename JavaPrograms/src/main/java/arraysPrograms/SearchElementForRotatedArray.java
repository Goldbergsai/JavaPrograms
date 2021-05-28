package arraysPrograms;

public class SearchElementForRotatedArray {

	public static void main(String[] args) {

		int arr[] = { 7, 8, 1, 2, 3, 4, 5, 6 };

		int start = 0;
		int end = arr.length - 1;

		// int valueIndex = pivotBinarySearch(arr, start, end,7);

		// int index =binarySearch(arr, start, end, 5);

		// System.out.println(" Value Index value of search element is :"+valueIndex);

	}

	public static int improvisedBinarySearch(int arr[], int start, int end, int value) {

		int mid = (start + end) / 2;

		if (arr[mid] == value) {

			return arr[mid];
		}

		if (arr[start] < arr[mid]) { // it means this half is a sorted array

			if (value >= arr[start] && value <= arr[mid]) {

				return improvisedBinarySearch(arr, start, mid - 1, value);

			}

			return improvisedBinarySearch(arr, mid + 1, end, value);

		}

		// if array [start -mid ] is not sorted then mid-end should be sorted

		if (value >= arr[mid] && value <= arr[end]) {

			return improvisedBinarySearch(arr, start, mid + 1, value);

		}
		return improvisedBinarySearch(arr, mid - 1, end, value);

	}

	public static int pivotBinarySearch(int arr[], int start, int end, int value) {

		int pivot = findPivot(arr, start, end);

		if (pivot == -1) {

			return binarySearch(arr, start, end, value);
		}

		while (start < end) {

			if (arr[pivot] == value) {

				return pivot;
			} else {
				if (arr[0] <= value) {
					pivot = pivot - 1;
				} else {
					pivot = pivot + 1;
				}

			}

		}
		return -1;

	}

	public static int findPivot(int arr[], int start, int end) {

		int mid = (start + end) / 2;
		if (start > end) {
			return -1;
		}

		if (arr[mid] > arr[mid + 1]) {
			return mid + 1;

		} else {

			if (arr[0] > arr[mid]) {

				return findPivot(arr, start, mid - 1);
			} else {

				return findPivot(arr, mid - 1, end);
			}
		}

	}

	public static int binarySearch(int arr[], int start, int end, int value) {

		int mid = (start + end) / 2;

		while (start < end) {

			if (arr[mid] == value) {

				return mid;

			} else {

				if (arr[mid] < value) {
					mid = mid - 1;

				} else {
					mid = mid + 1;
				}
			}

		}
		return -1;

	}

}
