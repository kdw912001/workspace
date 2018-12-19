package 변수.샘플;

import java.util.Scanner;

public class VariableSample {
	
	public void varMethod1() {
		// 지역변수 선언시 사용 할 수 있는 예약어
		// final 하나임.
		final double pi = 3.14159;
		//변수방에 기록된 초기값 변경 불가능
		System.out.println("pi : " + pi);
	}
	
	public void varMethod2() {

		//1. 변수 선언, 초기화 가능함
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		char gender;
		double score;
		
		//2.변수공간에 값 기록 처리
		//키보드로 입력받은 값 기록 처리
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("성별 입력(남/여) : ");
		gender = sc.next().charAt(0);
		System.out.println("점수 입력(소수점아래 첫째자리까지 : ");
		score = sc.nextDouble();
		
		//3. 변수에 기록된 값 계산처리
		
		//4. 결과에 대한 처리 : 화면(콘솔) 출력
		System.out.println(name+", "+age+"세, "+gender+"자, "+score+("점"));
		
	}
	
	public void varPractice() {
		//변수 연습 문제
		//원의 반지름(double) 값을 입력받아서 
		//원의 면적과 둘레 처리
		//면적 = 원주율*반지름*반지름
		//둘레 = 2*원주율*반지름
		
		final double PI = Math.PI;
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		//double num = sc.nextDouble();
		double radius = new Scanner(System.in).nextDouble();
		
		System.out.println("원의 면적 : "+(PI*radius*radius));
		System.out.println("원의 둘레 : "+(2*PI*radius));
		
		//System.out.printf("면적 : %g\n", PI*radius*radius);
		//System.out.printf("둘레 : %a\n", 2*PI*radius);
		
		System.out.printf("면적 : %.3f \n", PI*radius*radius);
		System.out.printf("둘레 : |%-10.2f| \n", 2*PI*radius);

	}
	
	public void testFormat() {
		int num = 100;
		System.out.printf("num : %d, %o, %x \n", num,num,num);
		
		String str = "java";
		System.out.printf("str : %s \n", str);
		
		char ch = '헐';
		System.out.printf("ch : %c, %d \n", ch,(int)ch);
		
	}
}
