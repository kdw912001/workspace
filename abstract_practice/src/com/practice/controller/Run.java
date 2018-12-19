package com.practice.controller;

import com.practice.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[3];
		
		v[0] = new Car("BMW", 12.5 , "sedan" ,4);
		v[1] = new Airplane("보잉747",0.062,"점보 제트기",16,5);
		v[2] = new Ship("낚시배",3.0,"어선",1);
		
	/*	for(int i=0; i<v.length;i++) {
			System.out.println(v[i]);
			System.out.println(v[i].howToMove());
			System.out.println(v[i].howToStop());
			System.out.println();
		}*/
		
		//향상된 for문
		/*	for(클래스 레퍼런스변수 : 배열명){
		 * 		레퍼런스.메소드();
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
