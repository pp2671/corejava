package com.array;

import java.util.Scanner;

public class CheckNoIfPresent {

	public static void main(String[] args) {

		int len = 0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length Of Array ");		
		len=sc.nextInt(); 
		
		int[] a=new int[len];
		
		for(int i=0; i<len; i++) {
		System.out.println("Enter "+i+"th Value For Array");
			a[i] =sc.nextInt(); 
		
	}
		
	System.out.println(" ");
	System.out.println("Enter a Number To Check Wheather it is available in Array Or Not");
	num=sc.nextInt();
		for(int i=0; i<len; i++) {
			
			if(i==num) {
				System.out.println(num+"is available in Array a");
			}
			
			else {
				System.out.println(" ");
				System.out.println(num+"is not available in Array a");	
				break;
			}
			

		}
		
		
	}

}
