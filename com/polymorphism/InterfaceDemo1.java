package com.polymorphism;

interface A {
	void method1();
}


interface B {
	void method2();
}

public class InterfaceDemo1 implements A,B{

	public static void main(String[] args) {
		
		A obj1=new InterfaceDemo1();
		obj1.method1();

		B obj2=new InterfaceDemo1();
		obj2.method2();

	}

	@Override
	public void method2() {
		
		System.out.println("Menthod Of Interface B");
		
	}

	@Override
	public void method1() {
		
		System.out.println("Menthod Of Interface A");
		
	}

}
