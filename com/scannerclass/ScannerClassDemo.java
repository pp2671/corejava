package com.scannerclass;
import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int a=obj.nextInt();
		int sq=a*a;
		System.out.println("Squere Of "+a+" is "+sq);		

		
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter Username :");
		String userName = myobj.nextLine();
		System.out.println("Given Username Is "+userName);

	}

}
