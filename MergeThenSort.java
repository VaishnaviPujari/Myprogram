import java.util.*;

public class MergeThenSort {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner sc=new Scanner(System.in);
		  
//_______________Input for Array_______________
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
 //_________________Print Array Elements_____________   
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
		  
 //________________Call to Function()___________________
		  		MergeThenSort md=new MergeThenSort();		  		
	     		int mid=md.getMedian(md.marge_Array(array1, array2));
		  		System.out.println("Median Of Merged Sorted Array:"+mid);
		 
		   
		}
//_________________Function to Calculate Median__________		
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
//_________________Funstion To Merge And Sort array_________________		
		private int[] marge_Array(int[] array1,int[] array2)
		{
			int mergedArray [] = new int[array1.length+array2.length]; 
			System.arraycopy(array1, 0, mergedArray, 0, array1.length);
		    System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
		    Arrays.sort(mergedArray);
		    System.out.println("Sorted Merged Array");
		    for(int num:mergedArray)
		    {
		    System.out.println(""+num);
		    }
		    return mergedArray;
		}
		
		
	}
