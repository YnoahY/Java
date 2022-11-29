package index02.sec03;

public class Exam04_LongOperationExample {

	public static void main(String[] args) {
		//정수 연산 시 자동 타입 변환
		
		/* 정수 기본형인 int보다 더 큰형이 있을 경우, 더 큰 형으로 자동 타입 변환 됨 */
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L; 
		/* long형 표현시 항상 끝에 'L' 붙여줘야 함 
		 * 소문자 'l'이 아닌 대문자 사용 → 숫자 1과 혼동됨*/
		long result = value1 + value2 + value3;
		System.out.println(result);

	}

}
