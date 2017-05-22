import java.util.Scanner;


public class MergeArrayDemo {
 
	MergeArrayDemo()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
//_________________Input for Array_____________
	  //Array1
	      System.out.println("Enter the Size of Array1");
	     
	      int size1=sc.nextInt();
	      int array1 [] = new int[size1];
	      for(int i=0;i<array1.length;i++)
	      {
	    	  array1[i]=sc.nextInt();
	      }
	     //Array2
	      System.out.println("Enter the Size of Array2");
	      int size2=sc.nextInt();
	      int array2 [] = new int[size2];
	      for(int i=0;i<array2.length;i++)
	      {
	    	  array2[i]=sc.nextInt();
	      }
//____________________print array1 and array2________________   
	      for(int i=0;i<array1.length;i++)
	      {
	    	  System.out.println("Element of Array1");
	    	  System.out.println(array1[i]);
	    	
	      }

	      for(int i=0;i<array2.length;i++)
	      {
	    	  System.out.println("Element of Array2");
	    	  System.out.println(array2[i]);
	    	
	      }
//__________________Call to Function___________________________	  
	  		MergeArrayDemo md=new MergeArrayDemo();
	  		int mid=md.getMedian(md.merge_And_Sort_Array(array1,array2));//pass to function
	  		System.out.println(mid);
	 
	   
	}
//____________________Function To get Median_____________________	
	private int getMedian(int []mergedArray)
	{
		 int mid;
	     int median=0;	   
		for(int i = 0; i < mergedArray.length; i++)
	    {     //System.out.println(c[i]);	        
	       
	        if(mergedArray.length%2==0)
	        {
	            mid=mergedArray.length/2;
	            median=(mergedArray[mid]+mergedArray[++mid])/2;
	           //System.out.println(median);
	        }
	        else
	        {
	        	median=(mergedArray.length+1)/2;
	           
	             //System.out.println(median);
	        }
	        
		}
		return median;		
	}
//_______________________Function To Merge and sort array____________________	
	private int[] merge_And_Sort_Array(int[] array1,int[] array2)
	{
		 int j = 0, k = 0; 
		int mergedArray [] = new int[array1.length+array2.length];
		    
		    for (int i = 0; i < mergedArray.length; i++) {
		        // Soting and merging of two arrays
				        if (j < array1.length && k < array2.length) 
				        {            
				            if (array2[k] < array1[j]) {	                
				            	mergedArray[i] = array2[k];
				                k++;
				            }	            
				            else {	                
				            	mergedArray[i] = array1[j];
				                j++;
				            }       
				        }     
				        else if (k < array2.length) {	           
				        	mergedArray[i] = array2[k];
				            k++;
				        }	        
				        else {
				           
				        	mergedArray[i] = array1[j];
				            j++;
				        }
		         }
		
		return mergedArray;
		
	}
	
}
