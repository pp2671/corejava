package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
	// Saad was here
		Scanner sc= new Scanner(System.in);
		
		int lenr,lenc;
		
//		Accepting User Input For Number Of Rows & Columns.
		
		System.out.println("Enter The Number Of Rows Of Array");
		lenr = sc.nextInt();
		System.out.println("Enter The Number Of Coloum Of Array");
		lenc = sc.nextInt();		
		
		
		int[][]a=new int[lenr][lenc];
		int i=0,j=0;
		int sum=0;
		
		
		for (i=0; i<lenr; i++) {
		 	for(j=0; j<lenc; j++) {
				
				System.out.println("Enter Value For Array's [" + i + "]" + "["  + j +  "]"  + "th Posttion");
				
				a[i][j]=sc.nextInt();
				
			}
		}
			
		System.out.println("  Array Printing in Progress......");
		
			
			for (i=0; i<lenr; i++) {
				
				for(j=0; j<lenc; j++) {

					System.out.print("  "+a[i][j]+"  ");
					sum += a[i][j];
				}
				System.out.println("");
			}
			
			System.out.println("  ");
			System.out.println("  ");
			
		System.out.println("The Sum Of All Elements in Array is: "+sum);
		System.out.println(" ");
		
		for(int p[]:a)
	{
			
////			for(int q:p)
////		{
////				System.out.print(q);
////			}
			
		System.out.println(Arrays.toString(p));
			
			
	}

	}

}
