package com.controlstructure;

import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		
		switch(a)
		{
		
		case 1:
			System.out.println("Case 1");
		
		case 2:
			System.out.println("Case 2");
			
		case 3:
			System.out.println("Case 3");
			
		case 4:
			System.out.println("Case 4");
			
			default:
				System.out.println("Default");
		}
	}

}
