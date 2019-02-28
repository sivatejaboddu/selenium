package com.hdfc.loans.carloans;


public class FirstClass 
{
	int a=200,b=150,c;
	public void add()
	{
		c=a+b;
		System.out.println("addition of a and b is :" + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("sbtraction of a and b is :" + c );
	}
	public static void main(String[] args) {
		System.out.println("Hi iam first class");
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
		
	}

}
