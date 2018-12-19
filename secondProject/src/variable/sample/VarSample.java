package variable.sample;

import java.util.Scanner;

public class VarSample {
	public void testMethod1() {
		//1. ���� ���� 
		//-> �� �����
		//�ڷ��� ������;
		boolean flag;  //1byte, true(��, ��Ʈ1), false(����, ��Ʈ0)
		byte bnum;  //1byte, ����
		short snum; //2byte, ����
		int num;   //4byte, ����(�⺻)
		long lnum;  //8byte, ����
		float fnum;  //4byte, �Ǽ� (�Ҽ��� ���ڸ� 7�ڸ�����)
		double dnum;  //8byte, �Ǽ� (�Ҽ��� ���ڸ� 15�ڸ�����)  (�⺻)
		char ch;  //2byte , �����ϳ�
		
		//2. �����濡 �� ���
		//������ = ��;
		flag = false;
		bnum = 127;
		snum = 32767;
		num = 2147483647;
		lnum = 27L;
		fnum = 2.212F;
		dnum = 3.212;
		ch = 'a';
		
		//3. ������ ��� : ������ ���
		//�����濡 ��ϵ� ���� �о��� �ǹ���
		System.out.println("flag : " + flag);
		System.out.println("bnum : " +bnum);
		System.out.println("snum : " +snum);
		System.out.println("num : " + num);
		System.out.println("lnum : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("dnum : " + dnum);
		System.out.println("ch : " + ch);
		
	}
	public void testMethod2() {
		//������ �ʱ�ȭ
		//�ڷ��� ������ = �ʱⰪ;
		boolean flag = true;  //1byte, true(��, ��Ʈ1), false(����, ��Ʈ0)
		byte bnum = 12;  //1byte, ����
		short snum = 230; //2byte, ����
		int num = 345;   //4byte, ����(�⺻)
		long lnum = 10L;  //8byte, ����
		float fnum = 3.5F;  //4byte, �Ǽ� (�Ҽ��� ���ڸ� 7�ڸ�����)
		double dnum = 89.5;  //8byte, �Ǽ� (�Ҽ��� ���ڸ� 15�ڸ�����)  (�⺻)
		char ch = 'Y';  //2byte , �����ϳ�
		
		
		//3. ������ ��� : ������ ���
		//�����濡 ��ϵ� ���� �о��� �ǹ���
		System.out.println("flag : " + flag);
		System.out.println("bnum : " +bnum);
		System.out.println("snum : " +snum);
		System.out.println("num : " + num);
		System.out.println("lnum : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("dnum : " + dnum);
		System.out.println("ch : " + ch);
		
	}
	public void example1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է�:");
		int first = sc.nextInt();
		System.out.print("�ι�° �����Է�:");
		int second = sc.nextInt();
		System.out.println("���ϱ� ���:"+ (first+second));
		System.out.println("���� ���:"+(first-second));
		System.out.println("���ϱ� ���:"+(first*second));
		System.out.println("�������� �� ���:"+(first/second));
		System.out.println("�������� ���������:"+(first%second));
		
	}
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�=");
		double width = sc.nextDouble();
		System.out.print("���� �Է�=");
		double height = sc.nextDouble();
		System.out.println("����="+(width*height));
		System.out.println("�ѷ�="+((width+height)*2));
	}
	public void testInput() {
		//Ŭ������ ���۷������� = new ������();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String name = sc.next();
		System.out.print("true/false �Է� : ");
		boolean flag = sc.nextBoolean();
		System.out.print("���� �Է� : ");
		int inum = sc.nextInt();
		System.out.print("�Ǽ� �Է� :");
		double dnum = sc.nextDouble();
		System.out.print("�����̸� Y/�ݴ��̸� N :");
		/*String answer = sc.next(); //"Y", "N"
		char ans = answer.charAt(0);*/
		char ans = sc.next().charAt(0);
		
		System.out.println("name :" + name);
		System.out.println("flag :" + flag);
		System.out.println("inum : " + inum);
		System.out.println("dnum : " +dnum);
		System.out.println("��ǥ��� :" + ans);
	}
	public void inputProfile() {
		//�Ż����� �Է¹޾� ��� Ȯ���ϴ� �޼ҵ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� :");
		String name = sc.next();
		System.out.print("���� :");
		int age = sc.nextInt();
		System.out.print("���� :");
		char sex = sc.next().charAt(0);
		System.out.print("��ȭ��ȣ");
		String tel = sc.next();
		System.out.println("�̸��� :");
		String email = sc.next();
		
		System.out.println(name +", "+age+", "+sex+", "+tel+", "+email);
		
		
	}
}
