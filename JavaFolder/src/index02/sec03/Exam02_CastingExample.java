package index02.sec03;

public class Exam02_CastingExample {

	public static void main(String[] args) {
		/*강제타입변환: 큰 허용범위의 타입을 작은 허용 범위 타입으로 강제로 나누어 한 조각만 저장
		 * () : 캐스팅 연산자 사용, 괄호 안이 나누는 단위
		 */
		int intValue = 44032; //int: 4byte
		char charValue = (char) intValue; //char: 2byte
		System.out.println(charValue);
		
		long longValue = 500; //8byte
		intValue = (int) longValue; //2byte
		System.out.println(intValue);
		
		double doubleValue = 3.14; //8byte
		intValue = (int) doubleValue; //→ int는 정수부분인 3만저장
		System.out.println(intValue);
	}

}
