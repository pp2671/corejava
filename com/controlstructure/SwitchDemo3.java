package com.controlstructure;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		System.out.println("Enter a Number: ");
		Scanner mth=new Scanner(System.in);
		month=mth.nextInt();
		
		switch(month)
		{
		case 1:
			System.out.println("You Selected Jan");
		break;
		
		case 2:
			System.out.println("You Selected Feb");
		break;
		
		case 3:
			System.out.println("You Selected Mar");
		break;
		
		case 4:
			System.out.println("You Selected Apr");
		break;
		
		case 5:
			System.out.println("You Selected May");
		break;
		
		case 6:
			System.out.println("You Selected Jun");
		break;
		
		case 7:
			System.out.println("You Selected Jul");
		break;
		
		case 8:
			System.out.println("You Selected Aug");
		break;
		
		case 9:
			System.out.println("You Selected Sept");
		break;
		
		case 10:
			System.out.println("You Selected Oct");
		break;
		
		case 11:
			System.out.println("You Selected Nov");
		break;
		
		case 12:
			System.out.println("You Selected Dec");
		break;
		
		default:
			System.out.println("Enter Valid input between 1 to 12");
		break;
		}

	}

}
