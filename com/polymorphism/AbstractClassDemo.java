package com.polymorphism;

abstract class Bank {

	abstract float rateofint();
	
}

class Hdfc extends Bank {

	@Override
	float rateofint() {
		
		return 7.2f;
	}
	
}

class Axis extends Bank {

	@Override
	float rateofint() {
		// TODO Auto-generated method stub
		return 8.5f;
	}	
	
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		
	Bank b=new Axis();	
	System.out.println(b.rateofint());
	
	Bank b1=new Hdfc();	
	System.out.println(b1.rateofint());
	
	}

}
