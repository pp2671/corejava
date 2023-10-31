package com.polymorphism;

class Demo{
	void syso() {
		
		System.out.println("This is Base Class");

	}
	
}

public class MethodOverriding extends Demo {

	void syso() {
		
		System.out.println("This is Derived Class");

	}

	public static void main(String[] args) {
		
		MethodOverriding obj=new MethodOverriding();
		
		obj.syso();
		

	}

}
