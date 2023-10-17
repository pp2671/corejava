package com.loops;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i,j;
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
