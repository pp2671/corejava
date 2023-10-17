package com.controlstructure;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Any Character: ");
		char ch;
		Scanner cha=new Scanner(System.in);
		ch=cha.next().charAt(0);
		
		switch(ch)
		{
		
		case 'a':
			System.out.println("It is a Vowel");
		break;
		
		case 'e':
			System.out.println("It is a Vowel");
		break;
		
		case 'i':
			System.out.println("It is a Vowel");
		break;
		
		case 'o':
			System.out.println("It is a Vowel");
		break;
		
		case 'u':
			System.out.println("It is a Vowel");
		break;
		
		case 'A':
			System.out.println("It is a Vowel");
		break;
		
		case 'E':
			System.out.println("It is a Vowel");
		break;
		
		case 'I':
			System.out.println("It is a Vowel");
		break;
		
		case 'O':
			System.out.println("It is a Vowel");
		break;
		
		case 'U':
			System.out.println("It is a Vowel");
		break;
		
		default:
			System.out.println("Not a Vowel");
		break;
		
		}

	}

}
