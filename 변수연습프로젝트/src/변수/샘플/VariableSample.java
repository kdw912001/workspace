package ����.����;

import java.util.Scanner;

public class VariableSample {
	
	public void varMethod1() {
		// �������� ����� ��� �� �� �ִ� �����
		// final �ϳ���.
		final double pi = 3.14159;
		//�����濡 ��ϵ� �ʱⰪ ���� �Ұ���
		System.out.println("pi : " + pi);
	}
	
	public void varMethod2() {

		//1. ���� ����, �ʱ�ȭ ������
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		char gender;
		double score;
		
		//2.���������� �� ��� ó��
		//Ű����� �Է¹��� �� ��� ó��
		System.out.print("�̸� �Է� : ");
		name = sc.nextLine();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		System.out.print("���� �Է�(��/��) : ");
		gender = sc.next().charAt(0);
		System.out.println("���� �Է�(�Ҽ����Ʒ� ù°�ڸ����� : ");
		score = sc.nextDouble();
		
		//3. ������ ��ϵ� �� ���ó��
		
		//4. ����� ���� ó�� : ȭ��(�ܼ�) ���
		System.out.println(name+", "+age+"��, "+gender+"��, "+score+("��"));
		
	}
	
	public void varPractice() {
		//���� ���� ����
		//���� ������(double) ���� �Է¹޾Ƽ� 
		//���� ������ �ѷ� ó��
		//���� = ������*������*������
		//�ѷ� = 2*������*������
		
		final double PI = Math.PI;
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		//double num = sc.nextDouble();
		double radius = new Scanner(System.in).nextDouble();
		
		System.out.println("���� ���� : "+(PI*radius*radius));
		System.out.println("���� �ѷ� : "+(2*PI*radius));
		
		//System.out.printf("���� : %g\n", PI*radius*radius);
		//System.out.printf("�ѷ� : %a\n", 2*PI*radius);
		
		System.out.printf("���� : %.3f \n", PI*radius*radius);
		System.out.printf("�ѷ� : |%-10.2f| \n", 2*PI*radius);

	}
	
	public void testFormat() {
		int num = 100;
		System.out.printf("num : %d, %o, %x \n", num,num,num);
		
		String str = "java";
		System.out.printf("str : %s \n", str);
		
		char ch = '��';
		System.out.printf("ch : %c, %d \n", ch,(int)ch);
		
	}
}
