package com.practice.controller;

import com.practice.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[3];
		
		v[0] = new Car("BMW", 12.5 , "sedan" ,4);
		v[1] = new Airplane("����747",0.062,"���� ��Ʈ��",16,5);
		v[2] = new Ship("���ù�",3.0,"�",1);
		
	/*	for(int i=0; i<v.length;i++) {
			System.out.println(v[i]);
			System.out.println(v[i].howToMove());
			System.out.println(v[i].howToStop());
			System.out.println();
		}*/
		
		//���� for��
		/*	for(Ŭ���� ���۷������� : �迭��){
		 * 		���۷���.�޼ҵ�();
		 * }
		 */
		
		for(Vehicle i:v) {
			System.out.println(i);
			System.out.println(i.howToMove());
			System.out.println(i.howToStop());
			System.out.println();
		}
	}

}
