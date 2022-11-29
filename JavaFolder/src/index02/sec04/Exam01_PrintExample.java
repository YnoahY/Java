package index02.sec04;

public class Exam01_PrintExample {

	public static void main(String[] args) {
		/*System.out(): 시스템의 표준 출력 장치로 출력
		 
		 *출력 메소드
		 * println(): 괄호 안의 내용 출력 후 행 바꿈
		 * prin(): 괄호 안의 내용 출력 - 리터럴:그대로, 변수: 저장된 값*/
		
		/* printf(): 괄호 안의 첫번째 문자열 형식대로 내용 출력
		 * 	 개발자가 원하는 형식화도니 문자열 출력(전체 출력 자리수 및 소수 자릿수 제한)
		 *	 d:정수, f:실수 s:문자열
		 *	 형식 문자열에 포함 될 값 2개 이상인 경우 값의 순번을 표시해야 함
		 *	 왼쪽 최하위 비트부터 작성됨
		 *** 지양 메소드: 자제할 것을 권하나 이용하기 편해서 그냥 사용. 이스케이프는 원달러로부터 시작
		 */
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); /*정수*/
		System.out.printf("상품의 가격:%6d원\n", value); /*6(n)자리 정수, 왼쪽 빈자리 공백*/
		System.out.printf("상품의 가격:%-6d원\n", value); /*6(n)자리 정수, 오른쪽 빈자리 공백*/
		System.out.printf("상품의 가격:%06d원\n", value); /*6(n)자리 정수, 왼쪽 빈 자리 0채움*/
		System.out.println();
		
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		/* %d = 10
		 * %10.2f = 7.2=10자리: 자리수 10중 2자리는 소수점
		 * 소수점 7자리, 소수점 이하 2자리, 왼쪽 빈자리 공백*/
		System.out.println();
		
		String name = "김백구";
		String job = "도적";
		System.out.printf("%08d | %-4s | %4s", 1, name, job);
		/*%08d = 1
		 *8자리 정수 왼쪽빈자리 0채움 | 4자리 문자열 오른쪽 빈자리 공백 | 4자리 문자열 왼쪽 빈자리 공백*/
	}
}




