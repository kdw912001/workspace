package kh.day1.test;

public class TestExample1 {

	public void example() {
		//���� : �� ������ ��
		//�ڷ��� ������ = �ʱⰪ;
		String  �̸� = "ȫ�浿";
		int ���� = 25;
		double Ű = 123.2; //�Ҽ��� �Ʒ� ù°�ڸ�����
		double ������ = 32.2; //�Ҽ��� �Ʒ� ù°�ڸ�����
		char ���� = 'M'; //(�� : M, �� : F)
		String ��ȭ��ȣ = "010-1234-1234";
		String �̸��� = "abvc@naver.com";
		
		System.out.println("�̸� : " + �̸�);
		System.out.println("���� : " + ����);
		System.out.println("Ű : " + Ű);
		System.out.println("������ : " + ������);
		System.out.println("���� : " + ����);
		System.out.println("��ȭ��ȣ : " + ��ȭ��ȣ);
		System.out.println("�̸��� : " + �̸���);
	}
	public static void main(String[] args) {
		// ��������
		// Ŭ������ ������ = new Ŭ������()
		//���۷�������.�޼ҵ��();
		
		TestExample1 test = new TestExample1();
		test.example();
		
	}

}
