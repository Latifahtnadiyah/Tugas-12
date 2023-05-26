// Function Linear Search (With nano time):
public class linearSearchTiming { 
  
    // Linear search Algorithm 
    public static int linearSearch(int[] arr, int x) { 
        int n = arr.length; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] == x) 
                return i; 
        } 
        return -1; 
    } 
  
    // Driver Code 
    public static void main(String[] args) { 
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; 
        int itemToBeSearched = 23; 
  
        // Use nano time function to record start time
        long startTime = System.nanoTime(); 
        int index = linearSearch(arr, itemToBeSearched); 
        
        // Use nano time function to record end time
        long endTime = System.nanoTime();
        
        if (index != -1) { 
            System.out.println("Element found at position: " + index); 
        } 
        else { 
            System.out.println("Element not found"); 
        } 
  
        // Calculate total time taken  
        long totalTime = (endTime - startTime); 
        System.out.println("Total time taken: "+totalTime +"ns"); 
    } 
}