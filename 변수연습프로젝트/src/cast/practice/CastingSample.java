package cast.practice;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode(){
		
		System.out.print("���� �Է� : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		System.out.println(ch + " is unicode : " + (int)ch);
	}
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� :");
		double a = sc.nextDouble();
		System.out.print("���� :");
		double b= sc.nextDouble();
		System.out.print("���� :");
		double c = sc.nextDouble();
		
		System.out.println("���� : "+(int)(a+b+c));
		System.out.println("��� : "+(int)((a+b+c))/3);
	}
	public void pirntBitCount() {
	
		System.out.println("���� �Է� : ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.println(num + "�� 2������ ���Ե� 1�� ���� : "+Integer.bitCount(num));
	}
}
