package variable.sample;

import java.util.Scanner;

public class VarSample {
	public void testMethod1() {
		//1. 변수 선언 
		//-> 방 만들기
		//자료형 변수명;
		boolean flag;  //1byte, true(참, 비트1), false(거짓, 비트0)
		byte bnum;  //1byte, 정수
		short snum; //2byte, 정수
		int num;   //4byte, 정수(기본)
		long lnum;  //8byte, 정수
		float fnum;  //4byte, 실수 (소수점 뒷자리 7자리까지)
		double dnum;  //8byte, 실수 (소수점 뒷자리 15자리까지)  (기본)
		char ch;  //2byte , 문자하나
		
		//2. 변수방에 값 기록
		//변수명 = 값;
		flag = false;
		bnum = 127;
		snum = 32767;
		num = 2147483647;
		lnum = 27L;
		fnum = 2.212F;
		dnum = 3.212;
		ch = 'a';
		
		//3. 변수의 사용 : 변수명 사용
		//변수방에 기록된 값을 읽어라는 의미임
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
		//변수의 초기화
		//자료형 변수명 = 초기값;
		boolean flag = true;  //1byte, true(참, 비트1), false(거짓, 비트0)
		byte bnum = 12;  //1byte, 정수
		short snum = 230; //2byte, 정수
		int num = 345;   //4byte, 정수(기본)
		long lnum = 10L;  //8byte, 정수
		float fnum = 3.5F;  //4byte, 실수 (소수점 뒷자리 7자리까지)
		double dnum = 89.5;  //8byte, 실수 (소수점 뒷자리 15자리까지)  (기본)
		char ch = 'Y';  //2byte , 문자하나
		
		
		//3. 변수의 사용 : 변수명 사용
		//변수방에 기록된 값을 읽어라는 의미임
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
		
		System.out.print("첫번째 정수 입력:");
		int first = sc.nextInt();
		System.out.print("두번째 정수입력:");
		int second = sc.nextInt();
		System.out.println("더하기 결과:"+ (first+second));
		System.out.println("빼기 결과:"+(first-second));
		System.out.println("곱하기 결과:"+(first*second));
		System.out.println("나누기한 몫 결과:"+(first/second));
		System.out.println("나누기한 나머지결과:"+(first%second));
		
	}
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력=");
		double width = sc.nextDouble();
		System.out.print("세로 입력=");
		double height = sc.nextDouble();
		System.out.println("면적="+(width*height));
		System.out.println("둘레="+((width+height)*2));
	}
	public void testInput() {
		//클래스명 레퍼런스변수 = new 생성자();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String name = sc.next();
		System.out.print("true/false 입력 : ");
		boolean flag = sc.nextBoolean();
		System.out.print("정수 입력 : ");
		int inum = sc.nextInt();
		System.out.print("실수 입력 :");
		double dnum = sc.nextDouble();
		System.out.print("찬성이면 Y/반대이면 N :");
		/*String answer = sc.next(); //"Y", "N"
		char ans = answer.charAt(0);*/
		char ans = sc.next().charAt(0);
		
		System.out.println("name :" + name);
		System.out.println("flag :" + flag);
		System.out.println("inum : " + inum);
		System.out.println("dnum : " +dnum);
		System.out.println("투표결과 :" + ans);
	}
	public void inputProfile() {
		//신상정보 입력받아 출력 확인하는 메소드
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("나이 :");
		int age = sc.nextInt();
		System.out.print("성별 :");
		char sex = sc.next().charAt(0);
		System.out.print("전화번호");
		String tel = sc.next();
		System.out.println("이메일 :");
		String email = sc.next();
		
		System.out.println(name +", "+age+", "+sex+", "+tel+", "+email);
		
		
	}
}
