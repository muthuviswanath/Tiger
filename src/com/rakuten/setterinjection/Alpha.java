package com.rakuten.setterinjection;

public class Alpha {
	Beta b;
	public Alpha() {
		System.out.println("You have created an object of Alpha");
	}

	public Beta getBeta() {
		return b;
	}

	public void setBeta(Beta b) {
		this.b = b;
	}

	void print() 
	{
		System.out.println("Hello Alpha");
		
	}
	
	void displayDetails() {
		print();
		b.print();
	}
}
