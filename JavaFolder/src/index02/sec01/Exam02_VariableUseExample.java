package index02.sec01;

public class Exam02_VariableUseExample {

	public static void main(String[] args) {

		
		
		// 변수사용 : 변수 값을 이용, 출력문& 연산식 수행
		int hour = 7;
		int minute = 27;
		
		/* +: 산술연산자, 연결연산자, 다형성을 다타내는 대표적인 기호
		 * 이형 연결시 연결연산자로 이용
		 */
		System.out.println(hour + "시간" + minute + "분"); //출력문 수행
		

		// (): 패스연산자가 아닐 시 연상의 우선순위를 나타냄
		int totalMinute = (hour*60) + minute;
		System.out.println("촣" + totalMinute + "분"); //연산식 수행

	}

}
