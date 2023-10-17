package com.loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter a Number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
				
		int i;
		System.out.println("The Table of "+a+" is:");
		for(i=1; i<=10; i++)
		{
			System.out.println(a*i);
		}

	}

}
