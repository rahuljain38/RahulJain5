package com.mahesh.oopsconcept;
class Result
{
	public void add(int a,int b)
	{
		//RJ
		int r = a+b;
		System.out.println(r);
	}
	public void add (int a)
	{
		System.out.println(a*a);
	}
	public void add (int a,int b,int c)
	{
		int m = a+b+c;
		System.out.println(m);
	}
	}
public class ComplitimePolymorphism {
	public static void main(String[] args) {
		Result rr = new Result();
		rr.add(5);
		rr.add(5, 6);
		rr.add(4,5,10);
		
	}

}
