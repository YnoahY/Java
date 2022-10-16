package a_intro;

public class P09_promotion {

	public static void main(String[] args) {
		//자동 타입 변환 = 프로모션 = 와이딩 = 확장 = 값손실 없음- 값 대입될 때 이루어짐

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; //숫자로 인식
		System.out.println("가의 유니코드: " + intValue);
		// char, byte ->int 로 변환 가능한 이유: 같은 정수로 묶여있기 때문에 가능
		  
		intValue = 50;
		long longValue = intValue;
		
		longValue = 100;
		float floatValue = longValue; //실수로 변환해서 100.0으로 출력
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F; //f를 붙여야 float으로 인식됨
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}
//한 메소드 안에서 선언은 한번만 가능, 타입은 한 변수에 한 번만!!
}