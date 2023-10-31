package com.inheritences;

public class ThisConstructor {
	
	ThisConstructor(){
		System.out.println("Default Constructor");
	}


	ThisConstructor(int a){
		 
	
		System.out.println("Parametersised Constructor");
	
	}
	
	ThisConstructor(int a,int b){
		
		this();
		
		System.out.println("Parametersised Constructor 2");
		
	}
	
	
	
	public static void main(String[] args) {
	
		ThisConstructor obj2=new ThisConstructor(5,2);
//		ThisConstructor obj1=new ThisConstructor(5);
//		ThisConstructor obj3=new ThisConstructor();

	}

}
