package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length For Array a : ");
		int lenga=sc.nextInt();
		System.out.println("Enter Length For Array b : ");
		int lengb=sc.nextInt();
		int[]a=new int[lenga];
		int i=0,j=0;
		int[] b=new int[lengb];
		int lena=a.length;
		int lenb=b.length;
		int[]c= new int[lena+lenb];
		int sum=0,sum1=0;
		int pos=0;
		
		
		for(i=0; i<a.length; i++) {
			
			
			System.out.println("Enter a integer value For array a's :"+i+"th Position");
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		
	
		for(i=0; i<b.length; i++) {
			
			
			System.out.println("Enter a integer value For array b's :"+i+"th Position");
			b[i]=sc.nextInt();
			sum1=sum1+b[i];
			
		}
		
	

	for (int arr: a) {
			
		c[pos]=arr;
		pos++;
	}
	
	for (int arr: b) {
		
		c[pos]=arr;
		pos++;
	}

	

	int	max=a[0];
	
	for(i=1; i<c.length; i++) {
		if(max<c[i]) {
			max=c[i];
		}
		
		System.out.println(" ");
		System.out.println("Value Of Array a is "+Arrays.toString(a));
		
		System.out.println(" ");
		System.out.println("The Sum Of All Elements in Array a is: "+sum);
		
		System.out.println(" ");
		System.out.println("Value Of Array b is "+Arrays.toString(b));
		
		System.out.println(" ");
		System.out.println("Value Of Array c is "+Arrays.toString(c));

		System.out.println(" ");
		System.out.println("The Largest Element in Array C is "+max);
		
		}
	
}
}