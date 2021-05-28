package arraysPrograms;

import java.util.Scanner;

public class FindTotalNoOFOddEvenNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);// scanner class to take values from console

		int maxRows, maxColumns;
		
		
		
	
	

		// takes max rows as integer number
		System.out.print("Enter total number of rows: ");
		maxRows = scanner.nextInt();

		int[][] arrayMain = new int[maxRows][];
		
	
		

		// for loop -- as we gave total row it will loop through that number (example = 2)
		// and will ask for every row how many column will be present and those column values
		for (int i = 0; i < arrayMain.length; i++) {
		    System.out.print("Enter total number of columns for the row - " + i  + ": ");
			maxColumns = scanner.nextInt();
			arrayMain[i] = new int[maxColumns];
			for (int j = 0; j < arrayMain[i].length; j++) {
			    System.out.print("Enter the value for [" + i + "] and [" + j + "]: ");
				arrayMain[i][j] = scanner.nextInt();
			}
		} 
        
        System.out.println();

		//looping through the given matrix
		for (int i = 0; i < arrayMain.length; i++) {

			// Initialize total number of
			// even & odd numbers to zero
			int nEvenNumbers = 0, nOddNumbers = 0;

			// prints row number with
			// total number of its values 
			System.out.println(	"Row " + i  + " with "
				+ arrayMain[i].length + " values:");
			
			for (int j = 0; j < arrayMain[i].length; j++) {
				System.out.print(arrayMain[i][j] + " ");

				// even & odd counter updated as
				// eligible number is found
				if (arrayMain[i][j] % 2 == 0) {
					nEvenNumbers++;
				}
				else {
					nOddNumbers++;
				}
			}
			System.out.println();

			// Prints total numbers of
			// even & odd
			System.out.println(
				"Total Even numbers: " + nEvenNumbers
				+ ", Total Odd numbers: " + nOddNumbers);
				
			System.out.println();
		}
	}

		
		
		
		
		
	}



