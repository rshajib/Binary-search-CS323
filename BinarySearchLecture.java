// This class uses code from Prof. Teitelman's lecture

public class BinarySearchLecture { 
	
	 int count = 0;
	
	int BinarySearchLecture(int arr[], int l, int r, int x) {
	   if (r >= l) { 
		   count++;
	      int mid = l + (r - l) / 2; 
	          
	      if (arr[mid] == x) 
	      {
	         count++;
	         return mid; 
	      }
	      if (arr[mid] > x) 
	      {  
	    	 count++; 
	         return BinarySearchLecture(arr, l, mid - 1, x);
	      }
	      else  
	      {  
	    	  count++;
	         return BinarySearchLecture(arr, mid + 1, r, x); 
	      }
	   } else {     
	      return -1;
	   }
	}

	public void setCount(int i) {
		this.count = i;
		
	} 

        
}
