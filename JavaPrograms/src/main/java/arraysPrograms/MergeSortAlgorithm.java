package arraysPrograms;

public class MergeSortAlgorithm {

	public static void main(String[] args) {
		int[] a = { 34, 12, 13, 10, 96, 28, 10, 7, 1 };
		
		divide(a, 0, a.length-1);
		sortArray(a);

	}
	
	public static void sortArray(int arr[]) {
		
		for(int x =0;x<arr.length;x++) {
			
			System.out.println(arr[x]);
		}
	}

	

	public static void divide(int arr[], int start, int end) {

		int mid = (start + end) / 2;
		if (start < end) {

			divide(arr, start, mid);

			divide(arr, mid + 1, end);
			mergeArray(arr, start, mid, end);
		}

	}

	public static void mergeArray(int arr[], int start, int middle, int end) {

		int arrLength = arr.length;
		int[] tempArr = new int[arrLength];

		for (int z = 0; z < arr.length; z++) {

			tempArr[z] = arr[z];

		}

		int i = start, j = middle + 1, k = start;

		while (i <= middle && j <= end) {

			if (tempArr[i] < tempArr[j]) {

				arr[k] = tempArr[i];
				k++;
				i++;
			} else {

				arr[k] = tempArr[j];

				j++;
				k++;
			}

		}

		for (; i <= middle; i++) {

			arr[k] = tempArr[i];
			k++;
		}
		for (; j <= middle; j++) {

			arr[k] = tempArr[j];
			k++;
		}
	}

}
