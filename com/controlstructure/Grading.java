package com.controlstructure;

public class Grading {

	public static void main(String[] args) {
//		A = Greater than 90%
//		B = Greater than 80%
//		C = Greater than 70%
//		D = Greater than 60%
//		E = Greater than 50%
//		F = Less than 50% Fail
		
		int grade=70;
		
		if(grade>90) {
			
			System.out.println("You Have A Grade");
			
		}
		
		else if(grade>80) {
			
			System.out.println("You Have B Grade");			
			
		}
		
		else if(grade>70) {
			
			System.out.println("You Have C Grade");						
			
		}
		
		else if (grade>60) {
			
			System.out.println("You Have D Grade");						
			
		}
		
		else if (grade>50) {
			
			System.out.println("You Have E Grade");						
			
		}
		
		else {
			
			System.out.println("You are Failed");						
			
		}

	}

}
