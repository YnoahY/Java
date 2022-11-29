package index02.sec01;

public class Exam01_VariableInitializationExample {

	public static void main(String[] args) {
		/*변수(Variable)
		 * 값을 저장할 수 있는 메모리의 특정 번지에 붙여진 이름
		 * 변수 통해 해당 메모리 번지에 하나의 값 저장하고 읽을 수 있음
		 * 다양한 타입의 값 저장 가능
		 * 재사용성 좋음
		 *규칙성
		 * 대소문자 구분
		 * 첫문자: 영소문자(class는 첫자 영대문자)
		 * 자바예약어 사용 불가
		 */
		 
		// int value; → 변수 value 선언, 초기화 하지 않은 변수는 메모리에서 값을 읽을 수 없음.
		
		// =: 대입연산자, 값을 대입, 오른쪽의 값을 왼쪽 변수에 주소부여
		int value = 20; /*value에 20의 주소 부여 → 변수 초기화
		                  초기값: 변수에 최초로 값이 저장, 메모리에 변수 생성*/
		
		int result = value + 10;
		
		
		System.out.println(result);

	}

}
