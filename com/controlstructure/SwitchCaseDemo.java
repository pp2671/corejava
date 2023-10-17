package com.controlstructure;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Your Choice :");
		System.out.println("1 : Monday");
		System.out.println("2 : Tuesday");
		System.out.println("3 : Wednesday");
		System.out.println("4 : Thursday");
		System.out.println("5 : Friday");
		System.out.println("6 : Saturday");
		System.out.println("7 : Sunday");
		
		int ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:	
			System.out.println("Monday : Working Day");
		break;	
		case 2:	
			System.out.println("Tuesday : Working Day");
		break;	
		case 3:	
			System.out.println("Wednesday : Working Day");
		break;	
		case 4:	
			System.out.println("Thursday : Working Day");
		break;
		case 5:	
			System.out.println("Friday : Working Day");
		break;
		case 6:	
			System.out.println("Saturday :Non-Working Day");
		break;
		case 7:	
			System.out.println("Sunday :Non-Working Day");
		break;
		default:
			System.out.println("Invalid Choice");
		break;			
		
		}
		
	}

}
