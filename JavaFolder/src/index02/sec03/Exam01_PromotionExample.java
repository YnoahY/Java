package index02.sec03;

public class Exam01_PromotionExample {

	public static void main(String[] args) {
		/*타입변환: 데이터 타입을 다른데이터 타입으로 변환
		 * 자동타입변환: 값의 허용범위가 작은 타입 → 큰타입 저장
		 * 기본타입 허용 번위 순: byte < short < int < long < float < double
		                      1       2      4    8 정수/실수 4     8
		 */
		
		//자동타입변환
		byte byteValue = 10;
		int intValue = byteValue;
		//char CharValue1 = byteValue; → 컴파일에러, short 이상의 상위 타입으로 저장해야됨
    	System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		int Value = charValue; //int타입으로 자동변환 → 유니코드 값 저장
		System.out.println("가의 유니코드: " + intValue);
		
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
