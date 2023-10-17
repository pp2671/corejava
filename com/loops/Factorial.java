package com.loops;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int i;
		int num=5;
		
		for(i=1; i<=num; i++) {
			
			fact=fact*i;
					
		}
		
		System.out.println(fact);
	}

}
