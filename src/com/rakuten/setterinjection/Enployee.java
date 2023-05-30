package com.rakuten.setterinjection;

public class Enployee {
	private int id;
	private String name;
	private String desig;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	public void displayEmployee() {
		System.out.println(this.id +" | " + this.name + " | " +
							this.desig);
	}
}
