package com.practice.model.vo;

public class Car extends Vehicle{
	private int tire;
	
	public Car() {
		super();
	}
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire=tire;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+this.tire;
	}
	
	@Override
	public String howToMove() {
		return "∂•¿ß∏¶ ¥ﬁ∑¡º≠ ¿Ãµø";
	}
	
	@Override
	public String howToStop() {
		return "∫Í∑π¿Ã≈©∏¶ π‚æ∆º≠ ∏ÿ√·¥Ÿ";
	}
}
