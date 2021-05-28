package arraysPrograms;

public class FindPairForGivenSumInSortedArray {

	public static void main(String[] args) {
	
		 int [] arr = {1,2,3,4,5,6,7,8,9,10};
	}
	
	
	
	public static int[] findPair(int arr[], int start , int end ,int givenSum) {
		
		int[] pair = {start, end};
		while(start < end) {
			
			if(arr[start]+ arr[end] > givenSum) {
				
				end--;
				
			}else if(arr[start] + arr[end] < givenSum) {
				start++;
			}else
			{
				return pair;
			}
			
		}
		return null;
		
		
		
	}

}
