package arraysPrograms;

public class SearchValueInSortedAndUnsortedArray {

	public static void main(String[] args) {
		
		int arr[]= {2,33,443, 55, 33, 9};
		
		findValueInUnsortedArray(arr, 99);
		

	}
	
	
	public static int findValueInUnsortedArray(int arr[], int searchValue) {
		
		
		for(int i=0; i<arr.length-1;i++) {
			
			if(arr[i]==searchValue) {
				
				System.out.println("Search value found at index : "+i+" and value is "+arr[i]);
				break;
			}else {
				
				System.out.println("Element not present");
			}
		
			
			
		}
		
		return searchValue;
	}

}
