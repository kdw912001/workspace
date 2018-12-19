package test.datetime;

import java.util.*;
import java.text.*;

public class TestDate {

	public static void main(String[] args) {
		// java.util.Date 클래스 메소드
		Date today = new Date();
		//시스템으로부터 현재 날짜와 시간정보를
		//읽어와서 객체 생성함
		System.out.println(today);//today.toString()
		System.out.println(today.getTime()); 
		//기준 날짜부터 현재 날짜까지를 초로 바꿈
		
		Date when = new Date(123456789000L);
		System.out.println(when);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) a hh:mm:ss"); 
		//HH24시간 hh12시간 a 오전오후표시 (E) 요일
		String fmDate = sdf.format(today);
		System.out.println(fmDate);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy'년' MM'월' dd'일' (E) a hh'시' mm'분' ss'초'");  //" "안에 " "못 쓰기 때문에 ' ' 작은 따옴표 사용
		System.out.println(sdf2.format(when));
	
	}

}
