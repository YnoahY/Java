package a_intro;

public class P16_print {

	public static void main(String[] args) {
		/*출력문
		 * print(); : 줄바꿈 없는 출력문
		 * println(); : print+line - 출바꿈 되는 출력문
		 * printf(); : (f:fromat)특정양식 지정 출력문((줄바꿈 없음, \으로 줄바꿈)
		 * 			 : %d - 정수, %f - 실수, %s - 문자열, \t - tab, \n - 줄바꿈, %% - %
		 * 			 : 공백과 -를 같이 사용할 수 없음*/
		int value = 123;
		System.out.printf("상품 가격: %d원\n", value);
		System.out.printf("상품 가격: %6d원\n", value); //왼쪽 공백
		System.out.printf("상품 가격: %-6d원\n", value); //오른쪽 공백
		System.out.printf("상품 가격: %06d원\n", value); //왼쪽 공백 0채움
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		//%d = 10, %10.f = area
		//10.2f = 소수점 포함 10자리중 2자리가 소수점 이하의 숫자
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%5d | %-10s | %10s\n", 1, name, job);
		
		

	}

}
