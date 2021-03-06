package 변수.형변환;

public class CastSample {
	
	public void method1() {
			int num = 12;
			double dnum = 3.3;
			
			double result = num + dnum;
			//원칙 1. 같은 자료형끼리만 계산 가능
			//int + double => 12 + 3.3
			//double  + double => 12.0 + 3.3
			//결과 자료형은 double 임
			
			System.out.println("result : "+result);
	
	}

	public void method2() {
		//원칙2. 같은 자료형끼리만 대입 가능함
		//자동형변환 : 작은 사이즈의 값이
		//큰 자료형 변수에 대입될 때 
		double dnum = 123;
		//int 123 이 double 123.0으로 바뀜
		
		System.out.printf("dnum : %.2f \n", dnum);
		
	}

	public void method3() {
		//3. 같은 자료형끼리만 대입 가능함
		double dnum = 123;
		//자동형변환됨
		int num = (int)34.5;
		//명시(강제) 형변환
		
		//원칙3. 계산의 결과도 같은 자료형이여야 함
		int k = Integer.MAX_VALUE;
		//int result = k + k;
		long result = (long)k + k;
		System.out.println("result : " + result);
				
	}
}
