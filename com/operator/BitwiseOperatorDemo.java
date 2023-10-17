package com.operator;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=2;
		
		System.out.println("Bitwise AND      " + (a & b));
		System.out.println("Bitwise OR       " +(a | b));
		System.out.println("Bitwise XOR      " + (a ^ b));
		System.out.println("Right Shifted    " + (a >> b));
		System.out.println("Left Shifted     " + (a << b));

	}

}
