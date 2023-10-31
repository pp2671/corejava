package com.array;

import java.util.Arrays;

public class ArraySortUsingInBuiltMethod {

	public static void main(String[] args) {
		
		int[] arr= {23,5,67,98,3,10,25};
		
		System.out.println("");
		System.out.println("Original Array : " + Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		
		
		System.out.println("");
		System.out.println("Original Array : " + Arrays.toString(arr));

	}

} 