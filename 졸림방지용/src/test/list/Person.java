package test.list;
import java.io.*;
public class Person implements Serializable{
	private static final long serialVersionUID = -3921979590929342993L;
	//public static final long serialVersionUID = 
	private String name;
	private int age;
	private Double point;
	
	public Person() {}

	public Person(String name, int age, Double point) {
		super();
		this.name = name;
		this.age = age;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getPoint() {
		return point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return this.name+", "+this.age+", "+this.point;
	}
}
