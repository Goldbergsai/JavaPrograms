package arraysPrograms;

public class InsertElementIntoArray {

	public static void main(String[] args) {

		int array[] = new int[10];

		array[0] = 10;
		array[1] = 10;
		array[2] = 10;
		array[3] = 10;
	

		
		insertAtStart(array, 19);
		for (int arr : array) {

			System.out.println(arr);
		}

		int[] arr = null;

		// insertElementsForExistingaArraySize(array);
		// insertElementsForDynamicArray(arr, 10);

	}
	
	
	public static void insertAtPosition(int arr[], int position, int value) {
		
		for(int i=arr.length-1;i>position;i--) {
			
			arr[i] =arr[i-1];			
		}
		arr[position]	=value;
	}
	
	

	public static void insertAtStart(int arr[], int value) {

		for (int i = arr.length; i < 0; i--) {
			
			arr[i]=arr[i-1];
			
						

		}
	arr[0]=value;
//	System.out.println(arr[0]);
	}

	public static void insertElementsForDynamicArray(int arr[], int arraySize) {

		arr = new int[arraySize];

		int j = 0;

		for (int i = 0; i < arraySize - 1; i++) {

			arr[i] = j + 1;
			j++;

			System.out.println(arr[i]);

		}

	}

	public static void insertElementsForExistingaArraySize(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

			System.out.println(arr[i]);
		}

	}

}
