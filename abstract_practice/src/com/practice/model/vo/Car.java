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
		return "������ �޷��� �̵�";
	}
	
	@Override
	public String howToStop() {
		return "�극��ũ�� ��Ƽ� �����";
	}
}
