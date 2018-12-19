package test.datetime;

import java.util.*;
import java.text.*;

public class TestDate {

	public static void main(String[] args) {
		// java.util.Date Ŭ���� �޼ҵ�
		Date today = new Date();
		//�ý������κ��� ���� ��¥�� �ð�������
		//�о�ͼ� ��ü ������
		System.out.println(today);//today.toString()
		System.out.println(today.getTime()); 
		//���� ��¥���� ���� ��¥������ �ʷ� �ٲ�
		
		Date when = new Date(123456789000L);
		System.out.println(when);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) a hh:mm:ss"); 
		//HH24�ð� hh12�ð� a ��������ǥ�� (E) ����
		String fmDate = sdf.format(today);
		System.out.println(fmDate);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy'��' MM'��' dd'��' (E) a hh'��' mm'��' ss'��'");  //" "�ȿ� " "�� ���� ������ ' ' ���� ����ǥ ���
		System.out.println(sdf2.format(when));
	
	}

}
