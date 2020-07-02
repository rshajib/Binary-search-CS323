
import java.util.Formatter ; // import for tabular output
import java.util.Random;
public class FirstAssignment {

 
	
	 // Driver method to test  
    public static void main(String args[]) 
    { 
    	
    	
    	
    	//==========================
    	
    	AdvancedBinarySearch bs = new AdvancedBinarySearch(); // binary search from lecture 
    	//BinarySearch bs = new BinarySearch(); // binary search from geekforgeeks, recursive
    	//BinarySearchLecture bs = new BinarySearchLecture();
    	
    	//==========================
    	
        int arr[] = new int[65536]; // initiate array
        int n = arr.length;  // length of array
        
        
        
        for (int i = 0; i<n; i++) 
        {
             arr[i] = new Random().nextInt(10000000); // assigning random numbers for the array
        }
        
       QuickSort qs = new QuickSort();
       
       qs.sort(arr, 0, n-1); // sorting array to run binary search 
        
        
        
        
        for (int i = 1; i <=10; i++)
        {
    
        	 int x = new Random().nextInt(10000000);
            System.out.println( i + "." + "Random search key: " + x );
        
   
	
        int result = bs.AdvancedBinarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else 
            System.out.println("Element found at index " + result); 
        
             int count = bs.count ; 
              
              System.out.println("Number of comparisons are " + count); 
        
              bs.setCount(0);
            //  System.out.format("%32s%10d%16s", x , count , "presnt");
               
}
}}

