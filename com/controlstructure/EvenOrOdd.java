package com.controlstructure;
	
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	int a=10;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int a=obj.nextInt();
		
		if(a%2==0) {
			
			System.out.println("Even Number");
			
		}
		
		else {
			
			System.out.println("Odd Number");
			
		}
		

//		int b=1700;
		
		Scanner obj2=new Scanner(System.in);
		System.out.println("Enter A Number To Check Leap Year ");
		int b=obj2.nextInt();
		
		if(b%4==0 && b%100!=0) {
			
			System.out.println("Leap Year");
			
		}
		
		else {
			
			System.out.println("Not Leap Year");
			
		}
	

	}

}
