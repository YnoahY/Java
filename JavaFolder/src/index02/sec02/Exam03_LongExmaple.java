package index02.sec02;

public class Exam03_LongExmaple {

	public static void main(String[] args) {
		long a = 10;
		long b = 20L;
		long c = 10000000000000000L; //int의 허용범위 초과로 컴파일 에러 → 리터럴 뒤에 L붙어줘야함
		long d = 10000000000000000L; /*리터럴 뒤의 L은 long형으로의 변경 의미, 
		                               소문자는 숫자 1과 혼동되므로 대문자 사용*/
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
