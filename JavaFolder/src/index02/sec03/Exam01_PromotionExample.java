package index02.sec03;

public class Exam01_PromotionExample {

	public static void main(String[] args) {
		/*Ÿ�Ժ�ȯ: ������ Ÿ���� �ٸ������� Ÿ������ ��ȯ
		 * �ڵ�Ÿ�Ժ�ȯ: ���� �������� ���� Ÿ�� �� ūŸ�� ����
		 * �⺻Ÿ�� ��� ���� ��: byte < short < int < long < float < double
		                      1       2      4    8 ����/�Ǽ� 4     8
		 */
		
		//�ڵ�Ÿ�Ժ�ȯ
		byte byteValue = 10;
		int intValue = byteValue;
		//char CharValue1 = byteValue; �� �����Ͽ���, short �̻��� ���� Ÿ������ �����ؾߵ�
    	System.out.println("intValue: " + intValue);
		
		char charValue = '��';
		int Value = charValue; //intŸ������ �ڵ���ȯ �� �����ڵ� �� ����
		System.out.println("���� �����ڵ�: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	

	}

}
