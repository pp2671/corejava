package com.loops;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter a Number to Check Wheather it is Palindrome Or Not :");
		System.out.println(" ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int rev=0; 
		int copy=a;
		int r=0;
		
		while(a!=0) {
			
			r=a%10;
			rev=rev*10+r;
			a=a/10;
			
		}
		
		if(rev==copy) {
			System.out.println("is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		

	}

}
