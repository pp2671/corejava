package com.inheritences;

public class SingleInheritenceDemo extends BaseClass {
	
	SingleInheritenceDemo(){
		
		System.out.println("SingleInheritenceDemo Constructor");
	}
	
	int print2() {
		
		int b=10;
		int c=20;
		
		int a;
		a=b+c;
		
		System.out.println("Random");
		
		return a;
		
	}

	public static void main(String[] args) {

		SingleInheritenceDemo obj=new SingleInheritenceDemo();
		obj.print1();
		System.out.println(obj.print2());
	}
	
}
