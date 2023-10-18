package com.array;

import java.util.Scanner;

public class CheckArray {

	public static void main(String[] args) {
		
		
		int len = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length Of Array ");		
		len=sc.nextInt(); 
		
		int[] a=new int[len];
		
		for(int i=0; i<len; i++) {
		System.out.println("Enter "+i+"th Value For Array");
			a[i] =sc.nextInt(); 			
			
		}
		System.out.print("List Of Positive Numbers");
		System.out.println("");
		for(int i=0; i<len; i++) {
			
		if(a[i]>0) {
			
			System.out.print(a[i]+",");
			
		}
//
//		if(a[i]<0) {
//			System.out.println(" ");
//			System.out.println(" ");
//			System.out.print(a[i]+"is Negetive Number");
//		}
//		
//		if (a[i]%2==0) {
//			System.out.println(" ");
//			System.out.println(" ");
//			System.out.print(a[i]+"is Even Number");
//		}
//		
//		if (a[i]%2!=0) {
//			System.out.println(" ");
//			System.out.println(" ");
//			System.out.print(a[i]+"is ODD Number");
//		}
//		
//		if (a[i]==0) {
//			System.out.println(" ");
//			System.out.println(" ");
//			System.out.print(a[i]+"This is Zero");
//		}
//		
		

		}
	}

}
