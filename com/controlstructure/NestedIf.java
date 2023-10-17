package com.controlstructure;

public class NestedIf {

	public static void main(String[] args) {
		int a=35;
		
		if(a<50){
			
			if(a>40) {
				
				System.out.println("The Number is Less Than 50 & Greater Than 40");
				
			}
			
			if(a>30){
				
				System.out.println("The Number is Less Than 50 & Greater Than 30");
				
			}
			
		}

		else {
			
			System.out.println("The Number is Greater Than 50");
			
		}
		
		int b=50;
		int c=10;
		

		if(a>b) {
			
			if(a>c) {
				
				System.out.println("A is Greater");
			}
							
		}		
		
		else if(b>a) {
			
			if(b>c) {
				
				System.out.println("B is Greater");
			}
		}
		
		else if(c>a && c>b) {
			
			System.out.println("C is Greater");
			
		}
		
		else {
			
			System.out.println("Wrong Input");
			
		}
		
		
	}

}
