package index02.sec03;

public class Exam05_OperationPromotionExample {

	public static void main(String[] args) {
		//실수 연산시 자동 형변환
		
		byte bValue1 = 10;
		byte bValue2 = 20;
		//byte bValue3 = bValue1 + bValue2; → 컴파일에러
		/* 변수가 연산식에 사용 되어 자동으로 int형으로 변환되어 byte형 변수의 허용범위가 넘어 컴파일 오류 */
		int iValue1 = bValue1 + bValue2;
		System.out.println(iValue1);
		
		
		char cValue1 = 'A';
		char cValue2 = 1;
		// char cValue3 = cValue1 + cValue2; → 컴파일에러, 위와 같은 이유
		System.out.println("유니코드: " + cValue1);
		System.out.println("츨력문자: " + (char) cValue2);
		
		
		int iValue3 = 10;
		int iValue4 = iValue3/4;
		System.out.println(iValue4);
		
		
		int iValue5 = 10;
		//int iValue6 = 10/ 4.0; → 컴파일에러
		/* int는 정수형, 4.0은 실수형이므로 int의 허용 범위가 넘어 컴파일 에러*/
		double dValue1 = iValue5/ 4.0;
		System.out.println(dValue1);
		
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		/* * 실수 결과를 얻으려면 실수 연산으로 변환 → 분자 or 분모 중 하나 (double)로 설정
		 
		 * double result = x/ y; 일 경우:
		 * 정수의 연산 결과는 정수이기 때문에 x/y는 실수 표현을 못하고 0을 반환
		 */
		System.out.println((result));

	}

}
