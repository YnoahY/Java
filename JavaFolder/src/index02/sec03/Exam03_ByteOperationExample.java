package index02.sec03;

public class Exam03_ByteOperationExample {

	public static void main(String[] args) {
		//정수 연산시 자동 타입 변환
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		/* int + byte = int로 형변환 
		 * short + short = int로 형변환
		 
		 * int보다 작은형 끼리의 연산은 int형으로 자동 타입 변환됨
		 */
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);

	}

}
