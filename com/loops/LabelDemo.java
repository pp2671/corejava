package com.loops;

public class LabelDemo {

	public static void main(String[] args) {
		
		outer:
			for(int i=1; i<=10; i++) {
				inner:
					for(int j=0; j<=10; j++) {
						
						if(i==5) {

							break outer;
						}
					}
				if(i==3) {
					continue;
				}
				
				System.out.println(i);
	 }

   }
	
}
