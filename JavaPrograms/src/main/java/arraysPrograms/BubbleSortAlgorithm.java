package arraysPrograms;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		
		int[] a = {36, 19 , 50 , 20 , 9 , 5};
		
		bubbleSortAlgorithm(a);

	}
	
	
	public static void bubbleSortAlgorithm(int arr[]) {
		
		
		int temp;
		
		for(int i=0; i<arr.length;i++)
		{ 
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				
				if(arr[j] > arr[j+1]) {
					
					temp=arr[j];
					
					arr[j] =arr[j+1];
					
					arr[j+1] = temp;
					
				}
					
				
				
			}
			
		}
		
		
		for(int k=0;k<arr.length;k++) {
			
			System.out.println(arr[k]);
		}
		
	}
	
	
	

}
