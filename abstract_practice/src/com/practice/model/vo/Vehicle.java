package com.practice.model.vo;

public abstract class Vehicle {
	private String name;
	private double mileage;
	private String kind;
	
	public Vehicle() {}

	public Vehicle(String name, double mileage, String kind) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String toString() {
		return this.name+" "+this.mileage+" "+this.kind;
	}
	
	public abstract String howToMove();
	
	public abstract String howToStop();
	
}
