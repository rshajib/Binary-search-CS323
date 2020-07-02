import java.lang.*;
import java.util.Formatter ; // import for tabular output
import java.util.Random;
public class FirstAssignment {

 
	
	 // Driver method to test  
    public static void main(String args[]) 
    { 
    	
    	
    	
    	//==========================
    	
    	//AdvancedBinarySearch bs = new AdvancedBinarySearch();   // Advanced binary search
    	//BinarySearch bs = new BinarySearch();                 // binary search from geekforgeeks, recursive
    	
    	BinarySearchLecture bs = new BinarySearchLecture();   // binary search from lecture
    	
    	//==========================
    	
        int arr[] = new int[65536];                            // initiate array
        int n = arr.length;                                      // length of array
        int expectedComp = (int) Math.log(n);
        System.out.println(expectedComp);
        int leftIndex = 0;
        int rightIndex = n - 1;
        
        
        for (int i = 0; i<n; i++) 
        {
             arr[i] = new Random().nextInt(10); // assigning random numbers for the array
        }
        
       QuickSort qs = new QuickSort();
       
       qs.sort(arr, 0, n-1); // sorting array to run binary search 
        
        
        String found;
        
        System.out.println("Trial       Number of Elements        Search Key    Found (Y/N)     Left Index   Right Index      Expected Comp         Actual Comp");
        	
        
        for (int i = 0; i <10; i++)
        {
    
        	 int x = new Random().nextInt(10000000);
         
        
   
	
        int result = bs.BinarySearchLecture(arr, 0, n - 1, x); 
        if (result == -1) 
            found = "no";
        else 
        	found = "yes";
        
             int count = bs.count ; 
              
             System.out.println(i+"           " +"   " + n + "                  " + x + "           " + found+"                   "+ leftIndex+"         "+ rightIndex+ "       "+"     "+expectedComp+"                 "+ count);   
        
              bs.setCount(0);
           
              
              
              
            
              
               
}
     
}
}


