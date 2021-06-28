package arraysPrograms;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {

		int[] a = { 6, 39, 11, 10, 66, 28, 19 };

		selectionSorting(a);
	}

	public static void selectionSort(int arr[]) {

		int temp;
		int min;

		for (int i = 0; i < arr.length; i++) {

			min = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[min]) {

					min = j;
				}

				temp = arr[i];

				arr[i] = arr[min];

				arr[min] = temp;
			}

		}

		for (int k = 0; k < arr.length; k++) {

			System.out.println(arr[k]);

		}

	}

	public static void selectionSorting(int arr[]) {

		int temp = 0;
		int min;

		for (int i = 0; i < arr.length; i++) {
			min = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > arr[min]) {
					
					 
 
					min = j;

				}
				
				temp = arr[i];
				
				
				arr[i] = arr[min];
				
				arr[min] =  temp; 
			}

		}

		for (int k = 0; k < arr.length; k++) {

			System.out.println(arr[k]);
		}
	}

}
