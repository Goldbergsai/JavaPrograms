package arraysPrograms;

public class FindPivotInSortedRotatedArray {

	public static void main(String[] args) {
		
		int arr[]= {4,5,6,7,3};
		
		System.out.println(findPivot(arr));
		
		
	}
	
	
	
	public static int findPivot(int arr[]) {
		int pivot = -1;
		
		for(int i=0; i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1]) {
				
				pivot=arr[i+1];
				break;
				
			}
			
			
			
		}
		return pivot;
		
	}

}
