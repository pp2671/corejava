package com.loops;

import java.util.Scanner;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		System.out.println("Enter a Number :");
		System.out.println(" ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		int f1,f2 = 0,f3=1;
		
		for (int i=1; i<=a; i++) {
			System.out.println(f2);
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}

	}

}
