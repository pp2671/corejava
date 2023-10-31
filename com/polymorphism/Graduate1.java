package com.polymorphism;
interface University
{
	void uniDetails(String name,String address,int id);
}
interface Teacher extends University
{
	void pay(String dept,int money);
}
interface Student extends University
{
	void gpa(int qp,int credit);
}

public class Graduate1 implements Teacher,Student{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graduate1 g=new Graduate1();
		g.uniDetails("SNDT","pune", 1);

	}

	@Override
	public void uniDetails(String name, String address, int id) {
		// TODO Auto-generated method stub
		System.out.println("nameUniversity"+name);
	}

	@Override
	public void gpa(int qp, int credit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay(String dept, int money) {
		// TODO Auto-generated method stub
		
	}

	
}
