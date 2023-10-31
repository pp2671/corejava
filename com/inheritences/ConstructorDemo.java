package com.inheritences;

class Demo {

	int a,b;
	
	Demo(){
		System.out.println("Default Constructor");
	}
	
	Demo(int a,int b){
	
		a=a;
		b=b;

		System.out.println(a+","+b);
		
		int c=a+b;
		
		System.out.println(c);
		
	}
	
	void display() {
		System.out.println(a+b);
	}
}


public class ConstructorDemo extends Demo{

	public static void main(String[] args) {
		
		
		ConstructorDemo obj=new ConstructorDemo();
		Demo d1=new Demo();		
		Demo d2=new Demo(2,4);	
		obj.display();
		

	}

}
