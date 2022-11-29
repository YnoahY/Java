package index04.sec02;

public class Exam07_WhileSumFormlTo10Example {

	public static void main(String[] args) {
		//1~100까지 누적 합계
		int sum = 0; //합계 지정 변수 선언
		int i = 1; // 변수 선언
		
		while(i<=100) /*조건*/{
			sum+=i; /*변수=변수+피연산자*/
			i++; //후위증가
		}
		System.out.println("1~" + (i-1) + "까지의 합: " + sum);

	}

}
