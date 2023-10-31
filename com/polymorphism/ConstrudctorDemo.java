package com.polymorphism;

class Animal{
	
	Animal(){
		System.out.println("Default Constructor");
	}
	
	void sleep() {
		System.out.println("Sleeping");
	}
	
}


public class ConstrudctorDemo extends Animal {
	
	void animalname() {
		
		System.out.println("Dog");
		
	}
	
	public static void main(String[] args) {
		
		ConstrudctorDemo a = new ConstrudctorDemo();
		
		a.animalname();
		a.sleep();
	}
	
	
	
}
