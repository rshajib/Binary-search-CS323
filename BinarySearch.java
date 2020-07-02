// Source: https://www.geeksforgeeks.org/binary-search/
// Recursive binary search

public class BinarySearch { 
   
	 int count = 0;
     
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        
    	
       
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            count++;
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x)  {
            	count++;
                return mid;
               
                
            }
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
            {
            	count++;
                return binarySearch(arr, l, mid - 1, x); 
                // count++;
            }
            
            // Else the element can only be present 
            // in right subarray 
            else {
            	count++;
            return binarySearch(arr, mid + 1, r, x); 
            
                //count++;
            }
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
    public void setCount(int i) {
		this.count = i;
		
	} 
}
  