package com.loops;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i,j;
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=n-i; j>=1; j--) {
				
				System.out.print(" ");
				
			}
			
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
