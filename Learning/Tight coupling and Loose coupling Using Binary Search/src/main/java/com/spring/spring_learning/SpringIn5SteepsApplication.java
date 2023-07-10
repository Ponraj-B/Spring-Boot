package com.spring.spring_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5SteepsApplication {

	public static void main(String[] args) {
		System.out.println("HI");
		BinarySearchAlgorithm sort_algorithm = new BinarySearchAlgorithm(new QuickSortAlgorithm());
		int arr[] = new int[] {10,2,4,5,-1};
		sort_algorithm.binarysearch(arr,10);
//		if(result>=0)
//			System.out.println("Element not found at index "+ result);		
//		else
//			System.out.println("Element not found");
		SpringApplication.run(SpringIn5SteepsApplication.class, args);
	}
}
