   package index02.sec02;

public class Exam04_CharExample {

	public static void main(String[] args) {
		/*char 
		 * 하나의 문자를 저장
		 * 작은 따옴표로 감싼 문자 리터럴 → 유니코드로 변환 되어 저장
		 * 정수타입 → 10진수, 16진수 형태의 유니코드로 저장 가능 
		 */
		
		char c1 = 'A'; //문자
		char c2 = 65; //10진수
		char c3 = '\u0041'; //16진수
		
		char c4 = '가'; //문자
		char c5 = 44032; //10진수
		char c6 = '\uac00'; //16진수, 하나의 문자 취급
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

	}

}
