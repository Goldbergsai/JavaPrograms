package arraysPrograms;

public class FindPairForGivenSumInSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(findElementInWindowSize(arr, 3, 1));

	}

	public static boolean findElementInWindowSize(int arr[], int segmentSize, int value) {

		boolean flag = false;
		int j = 0;
		for (int i = 0; i < arr.length; i = i + segmentSize) {

			for (j = i; j < i + segmentSize; j++) {

				if (j < arr.length && arr[j] == value) {

					break;

				}

				if (j > arr.length || j == i + segmentSize) {

					return false;
				}

			}

		}

		if (j < arr.length) {
			return true;
		}
		return flag;

	}

}
