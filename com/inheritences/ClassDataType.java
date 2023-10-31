package com.inheritences;

public class ClassDataType {

	int num;
	ClassDataType(int num){
		this.num=num; 
		}
	
	void show() {
	
		System.out.println("Number "+this.num);
		
	}
	
	ClassDataType incr() {
		
	num++;
	return this;
	
	}	
	
	public static void main(String[] args) {

		ClassDataType add=new ClassDataType(10);
		
		add.incr().incr().incr();
		add.show();
		add.incr();
		add.show();
		

	}

}
