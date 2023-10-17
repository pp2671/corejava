package com.loops;

import java.util.Scanner;

public class ArmstrongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		int arm=0,r=0;
		int n=sc.nextInt();
		int copy=n;
		int temp1=n;
		int digit=0;
		
		while(temp1>0) {
			temp1=temp1/10;
			digit++;		
		}
		
//		System.out.println("Total Number Of digit given in Number "+digit);
		
		while(n!=0) {
			r=n%10;
			arm +=(Math.pow(r, digit));
			n=n/10;
		}
		if(arm==copy) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}
}




