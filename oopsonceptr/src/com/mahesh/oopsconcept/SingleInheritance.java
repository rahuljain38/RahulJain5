package com.mahesh.oopsconcept;
class Emp1
{
void show()
{System.out.println("in parent class");
	}
	}
class Emp2 extends Emp1
{ void display()
	{
	 System.out.println("in child class");
	}
	}
class Emp3 extends Emp2
	{
	 void net()
	 {
		 System.out.println("welcome mahesh ahire from chotta pakistan");
	 }
	}
public class SingleInheritance {
	public static void main(String[] args) {
		Emp3 e2 = new Emp3();
		e2.show();
		e2.display();
		e2.net();
		System.out.println("-----------");
		
	}

}
