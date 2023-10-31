package com.inheritences;

class Base {
	Base(){
		System.out.println("Base()");
	}
	
	Base(int a){
		
		System.out.println("Base(int a)");
	}
}

class Child2 extends Base {
	
	Child2(){
		
		System.out.println("Child2()");

	}
	
	Child2(int b){

		System.out.println("Child2(int b)");
		
	}
}

class Child3 extends Child2 {
	
	Child3(){

		super(1);
		System.out.println("Child3()");
		
	}
	
	Child3(int c){

		System.out.println("Child3(int c)");
		
	}
	
}

public class ConstructorChaining extends Child3 {
	
	ConstructorChaining(){
		
		System.out.println("ConstructorChaining()");		
		
	}
	
	ConstructorChaining(int d){
		
		System.out.println("ConstructorChaining(int d)");		
		
	}

	public static void main(String[] args) {
		
		ConstructorChaining obj=new ConstructorChaining();
		

	}

}
