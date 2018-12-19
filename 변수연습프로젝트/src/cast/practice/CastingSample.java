package cast.practice;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode(){
		
		System.out.print("문자 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		System.out.println(ch + " is unicode : " + (int)ch);
	}
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
		double a = sc.nextDouble();
		System.out.print("영어 :");
		double b= sc.nextDouble();
		System.out.print("수학 :");
		double c = sc.nextDouble();
		
		System.out.println("총점 : "+(int)(a+b+c));
		System.out.println("평균 : "+(int)((a+b+c))/3);
	}
	public void pirntBitCount() {
	
		System.out.println("정수 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.println(num + "의 2진수에 포함된 1의 갯수 : "+Integer.bitCount(num));
	}
}
