package com.loops;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i);
		}
		
		System.out.println("");
		
		for(int i=1; i<=10; i++) {
			if(i==5)
			{
			continue;
			}
			System.out.print(i);
		}
	}

}
