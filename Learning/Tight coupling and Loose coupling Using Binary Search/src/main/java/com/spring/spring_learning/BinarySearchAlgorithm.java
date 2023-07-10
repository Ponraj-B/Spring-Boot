package com.spring.spring_learning;

public class BinarySearchAlgorithm 
{
	private SortAlgorithm sort_algorithm;
	
	public BinarySearchAlgorithm(SortAlgorithm algorithm)
	{
		sort_algorithm = algorithm;
	}
	
	public void binarysearch(int numbers[], int key)
	{
		if(numbers.length==0)
		{
			System.out.println("Array Can't be empty");
			return;
		}
		
		int arr[] = sort_algorithm.sort(numbers);

		int first = 0;
		int last = arr.length-1;
		int mid = (first + last)/2;
		int index = -1;
		while( first <= last )
		{  
			if ( arr[mid] < key )
			{  
				first = mid + 1;     
		    }
			else if ( arr[mid] == key )
			{  
		        System.out.println("Element is found at index: " + mid);  
		        index = mid;
		        break;  
		    }
			else
			{  
		        last = mid - 1;  
		    }  
		    mid = (first + last)/2;  
		}
		if ( first > last )
		{  
		   System.out.println("Element is not found!");  
		}  
		
		
	}
}
