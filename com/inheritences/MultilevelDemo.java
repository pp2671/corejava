package com.inheritences;

import java.util.Scanner;

class organization {
	 
	 String org_Name;
	 public String getOrg_Name() {
		return org_Name;
	}
	public void setOrg_Name(String org_Name) {
		this.org_Name = org_Name;
	}
	int org_Id;
	public int getOrg_Id() {
		return org_Id;
	}
	public void setOrg_Id(int org_Id) {
		this.org_Id = org_Id;
	}

}

class department extends organization
{
	 String[] dept_list= new String[5];
	 public String[] getDept_list() {
		return dept_list;
	}

	public void setDept_list(String[] dept_list) {
		this.dept_list = dept_list;
	}

	void display()
	 {
		 System.out.println("this is display");
	 }
	void input(){ 
		Scanner scan=new Scanner(System.in);
	
	for(int i=0;i<5;i++)
	{
		getDept_list()[i]=scan.next();
		
	}
	
	System.out.println("Enter organization name");
	setOrg_Name(scan.next());
		
	}

	
	void displayDeptList()
	{
		for(String ele:getDept_list()) {
			System.out.println(ele);
		}
		
		System.out.println("Oraganization name is "+getOrg_Name());
	}
	 
 }

class vendor_org extends department
{
	 String vendor_String;
	 String vendor_Add;
	public String getVendor_String() {
		return vendor_String;
	}
	public void setVendor_String(String vendor_String) {
		this.vendor_String = vendor_String;
	}
	public String getVendor_Add() {
		return vendor_Add;
	}
	public void setVendor_Add(String vendor_Add) {
		this.vendor_Add = vendor_Add;
	}
}


public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
vendor_org vendor=new vendor_org();
		
		vendor.display();
		vendor.input();
		vendor.displayDeptList();


	}

}
