
public class AdvancedBinarySearch {
	
     int count = 0; 

	// Returns location of key, or -1 if not found 
	int AdvancedBinarySearch(int arr[], int l, int r, int x) 
	{ 
		   int m; 
		   
		    while( r - l > 1 ) 
		    {  
		    	count++;
		        m = l + (r-l)/2; 
		        
		        
		       
		  
		        if( arr[m] <= x ) {
		            l = m; 
		            //count++;
		        }
		        else
		        {
		            r = m; 
		           // count++;
		        }
		    } 
		  
		    if( arr[l] == x ) 
		    {
		    	count++;
		        return l; 
		       
		    }
		    
		    
		    if( arr[r] == x ) 
		    {
		    	count++;
		        return r; 
		       
		    }
		    else
		    {
		    	count++;
		        return -1; 
		       
		    }
	}
	
	public void setCount(int i) {
		this.count = i;
		
	} 

}
