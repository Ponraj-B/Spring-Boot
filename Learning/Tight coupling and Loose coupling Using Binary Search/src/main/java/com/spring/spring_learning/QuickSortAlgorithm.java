package com.spring.spring_learning;

public class QuickSortAlgorithm implements SortAlgorithm
{

	int partition(int arr[],int low,int high)
	{
		int pivot = arr[high];
		int i = (low-1); // index of smaller element
		for (int j=low; j<high; j++)
		{
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot)
			{
				i++;
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}

	
	private int[] sortImplementation(int arr[],int low, int high)
	{
		if (low < high)
		{
			/* pi is partitioning index, arr[pi] is
			now at right place */
			int pi = partition(arr, low, high);
		
			// Recursively sort elements before
			// partition and after partition
			sortImplementation(arr, low, pi-1);
			sortImplementation(arr, pi+1, high);
		}
		return arr;
	}
	
	
	
	public int[] sort(int arr[]) 
	{
		int new_arr[] = sortImplementation(arr,0,arr.length-1);
		return new_arr;
	}
}



/* The main function that implements QuickSort()
arr[] --> Array to be sorted,
low --> Starting index,
high --> Ending index */

