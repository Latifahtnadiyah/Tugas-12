// Java program to implement Binary Search using NanoTime 
import java.util.Arrays; 

public class BinarySearchUsingNanoTime { 
	
	// Function to do binary search using nanoTime 
	public static int binarySearch(int arr[], int x) 
	{ 
		long startTime = System.nanoTime(); // Start time 

		int start = 0, end = arr.length - 1; 
		while (start <= end) { 
			int mid = start + (end - start) / 2; 

			// Check if x is present at mid 
			if (arr[mid] == x) 
				return mid; 

			// If x greater, ignore left half 
			if (arr[mid] < x) 
				start = mid + 1; 

			// If x is smaller, ignore right half 
			else
				end = mid - 1; 
		} 

		long endTime = System.nanoTime(); // End time 

		System.out.println("Time Taken in nanoseconds: " + (endTime - startTime)); 

		// if we reach here, then element was not present 
		return -1; 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int x = 10; 

		int result = binarySearch(arr, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "position " + result); 
	} 
}