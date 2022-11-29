package index02.sec03;

public class Exam06_StringConcatExample {

	public static void main(String[] args) {
		/*+ 연산에서의 문자열 자동 타입 변환
		 * 피연산자가 모두 숫자일 경우 덧셈 연산: 산술연산
		 * 피연산자 중 하나가 문자열 일 시 나머지도 문자열로 자동 변환, 결합 연산: 연결연산*/
		
		//숫자 연산
		int Value = 10 + 2 + 8;
		System.out.println("Value : " + Value);
		
		//결합연산
		/* 숫자+숫자=산술연산, 문자+문자, 숫자+문자=연결연산 
		 * 문자 뒤에, 숫자 사이에 문자열 끼어 있으면 전체를 문자열 취급*/
		
		//10+2는 산술연산 +8은 연결 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);
		//전체 문자열
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);
		//전체 문자열
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);
		//괄호 있을 시엔 괄호 먼저 처리
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4);

	}

}
