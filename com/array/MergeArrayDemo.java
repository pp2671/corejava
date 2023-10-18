package com.array;

import java.util.Scanner;

public class MergeArrayDemo {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		int lenr,lenc;
		
//		Accepting User Input For Number Of Rows & Columns.
		
		System.out.println("Enter The Number Of Rows Of Array");
		lenr = sc.nextInt();
		
		
		int[]a=new int[lenr];
		int[]b=new int[lenr];
		int[]c=new int[lenr+lenr];
		int k=0;
		
		int i=0,j=0;
		
		
		for (i=0; i<lenr; i++) {
				
				System.out.println("Enter Value For A Array's [" + i + "]" + "th Posttion");
				
		 	a[i]=sc.nextInt();
		}
		
		
		for (i=0; i<lenr; i++) {
		
			System.out.println("Enter Value For B Array's [" + i + "]" + "th Posttion");
				
				b[i]=sc.nextInt();
				
			}
		
		
//		for(i=0; i<lenr; i++) {
//			
//			for(j=0; j<lenr; j++) {
//			
//		
//				if(k<lenr+lenr) {
//				
//				c[k]=a[i];
//				k++;
//				c[k]=b[i];
//				k++;
//			}
//				
//		}
//	}
		
		int pos=0;
		int pos2=1;

		for (int arr: a) {
				
			c[pos]=arr;
			pos=pos+2;
		}
		
		for (int arr: b) {
			
			c[pos2]=arr;
			pos2=pos2+2;
		}

		

	 	for (i=0; i<lenr+lenr; i++) {
			
				System.out.print("  "+c[i]+"  ");
				
			System.out.println("");
		}
		
	}

}
