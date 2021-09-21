package com.mahesh.oopsconcept;

class addition {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

}

class div extends addition {
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a / b);
	}
}

class multiplication extends addition {
	public void add(int a, int b) {
		System.out.println(a * b);
	}
}

public class RuntimePolymorphism {
	public static void main(String[] args) {
		addition mm = new multiplication();
		mm.add(5, 5);
		addition div1 = new div();
		div1.add(10, 5);
		addition add1 = new addition();
		add1.add(5, 6);

	}

}
