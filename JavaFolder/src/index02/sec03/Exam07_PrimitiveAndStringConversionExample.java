package index02.sec03;

public class Exam07_PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		/* String(문자열) → 기본타입으로 강제 타입변환
		 ** 기본형으로 변경 가능한 것: 모양이 숫자인 문자열만 변환 가능**

		 * String(클래스) str(참조변수) = x;
		 * byte value = byte Byte.parseByte(str);
		 * short value = Short.parseShort(str);
		 * int value = Integer.parseInt(str);
		 * long value = Long.parseLong(str);
		 * float vlaue = Float.parseFloat(str);
		 * double value = Double.parseDouble(str);
		 * boolean value = Boolean.parseBoolean(str);
		 */


		//문자열 → 기본타입
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

		/* 문자열이 숫자 외 요소 포함시, 숫자 타입 변환 시도할 경우 숫자형식 예외 발생: NumFormatException
		 * String.valueOf() 메소드: 기본타입 → 문자열로 변환
		 * String(→Class).valueOf(→메소드)*/
		
		//기본타입 → 문자열
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);


	}

}

