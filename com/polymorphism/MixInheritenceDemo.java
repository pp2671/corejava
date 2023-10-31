package com.polymorphism;

interface Teachers {

	void pay(String dept,int money);
	
}

interface Students {
	
	float cgpa(float a);
	
}

class Graduate implements Teachers,Students {

	@Override
	public float cgpa(float a) {
		
		return a;
	
	}

	@Override
	public void pay(String dept, int money) {
		
	System.out.println("Department is "+dept+" Salary is "+money);
		
	}
	
}


public class MixInheritenceDemo extends Graduate1 {

	public static void main(String[] args) {

		MixInheritenceDemo obj = new MixInheritenceDemo();
		
		System.out.println(obj.cgpa(7.30f));
		obj.pay("MCA" , 25000);

	}

}
