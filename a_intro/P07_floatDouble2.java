package a_intro;

public class P07_floatDouble2 {

	public static void main(String[] args) {
		Integer value1 = Integer.parseInt("10"); // Integer => wrapper
		Double value2 = Double.parseDouble("3.14");
		Boolean value3 = Boolean.parseBoolean("true");
		//int - 기본타입 
		//Integer - class 기반 참조타입
				
		// getClass().getSimpleName()); => class 사용하여 객체 타입 확인
		System.out.println("value1: " + value1);
		System.out.println("value1:" + value1.getClass().getSimpleName());
		System.out.println("value2: " + value2);
		System.out.println("value2:" + value2.getClass().getSimpleName());
		System.out.println("value3: " + value3);
		System.out.println("value3:" + value3.getClass().getSimpleName());

		String str1 = String.valueOf(10); // 숫자(기본타입)->문자열
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1: " + str1);
		System.out.println("str1:" + str1.getClass().getSimpleName());
		System.out.println("str2: " + str2);
		System.out.println("str2:" + str2.getClass().getSimpleName());
		System.out.println("str3: " + str3);
		System.out.println("str3:" + str3.getClass().getSimpleName());
	}


}
