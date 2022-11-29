package index02.sec04.verify;

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {
		//간단 계산기
		
		Scanner scanner = new Scanner(System.in); 
		//scanner 변수 선언 = new로 scanner생성(시스템의 입력 장치로 부터 읽는)
		//스캐스 생성 완료
		
		System.out.print("첫번째 수: "); //console에 출력할 문자:"첫번째 수: "
		String strNum1 = scanner.nextLine(); //string 변수 선언 = enter키 이전까지 입력된 문자열 읽음
		//키보드로 입력
		
		System.out.print("두번째 수: "); //console에 출력할 문자:"두번째 수: "
		String strNum2 = scanner.nextLine(); //string 변수 선언(string형만 받음) = enter키 이전까지 입력된 문자열 읽음
		//키보드로 입력
		
		int num1 = Integer.parseInt(strNum1); //string형인 strNum1을 int로 변경
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		

	}

}

/*nextLine() 메소드
 * 엔터키 치기 전까지 입력한 을 읽어 들임
 * 문자열만 반환*/