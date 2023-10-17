package com.operator;

public class AssignmentOperatorDemo {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("  "+(b+=a));
		System.out.println("  "+(b-=a));
		System.out.println("  "+(b*=a));
		System.out.println("  "+(b/=a));
		
	}

}
