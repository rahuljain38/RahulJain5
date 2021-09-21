package com.mahesh.oopsconcept;
class Add1
{
	int a, b;
   public Add1()
   {
	   System.out.println("hi");
   }
	public Add1(int a, int b) {
		this.a=a;
		this.b=b;




	}
	
	
	
	}
public class ConstructorNoArg {
public static void main(String[] args) {
	Add1 a = new Add1();
	Add1 a1 =new Add1(5,6);
	Add1 a3 = new Add1(10,15);
	System.out.println("addition 1 :"+a1.a +":"+a1.b);
	System.out.println(a1.a+a1.b);
	System.out.println("addition 2 :"+a3.a +":"+a3.b);
	System.out.println(a3.a * a3.b);
	
	
}
}
