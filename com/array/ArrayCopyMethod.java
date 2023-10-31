package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMethod {

	public static void main(String[] args) {
		
		int len = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length Of Array ");		
		len=sc.nextInt(); 
		
		int[] a=new int[len];
		int[] b=new int[len];
		int[] c=new int[len];
		
		for(int i=0; i<len; i++) {
		System.out.println("Enter "+i+"th Value For Array");
			a[i] =sc.nextInt(); 
		
	}		
		
		System.arraycopy(a, 0, b, 0, len);
		
		System.out.println(" ");
		System.out.println("Value Of Array a is "+Arrays.toString(a));
		
		
		System.arraycopy(b, 1, c, 2, 1);
		System.out.println(" ");
		System.out.println("Value Of Array b is "+Arrays.toString(b));
		
		
	
		System.out.println(" ");
		System.out.println("Value Of Array c is "+Arrays.toString(c));


	}

}
