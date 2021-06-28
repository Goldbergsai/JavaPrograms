package arraysPrograms;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {

		int[] a = { 7, 28, 3, 6, 10, 1 };

		insertionSort(a);

	}

	public static void insertionSort(int arr[]) {

		
		int temp;int j;
		
		
		for(int i=1; i<arr.length;i++) {
			
			
			temp =arr[i];
			
			j=i;
			
			while(j >0  && arr[j-1] > temp) {
				
				
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = temp;
		}
		
		for(int k=0; k<arr.length;k++) {
			
			System.out.println(arr[k]);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
