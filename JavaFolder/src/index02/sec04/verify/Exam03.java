package index02.sec04.verify;

import java.util.*;

public class Exam03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //new로 scanner 객체 생성과 변수 선언
		
		System.out.println("[ 필수 정보 입력 ]"); //()안의 내용 출력
		
		System.out.print("1. 이름: "); //()안의 내용 출력
		String name = scanner.nextLine(); //엔터 전까지 입력된 문자열 읽음
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String num = scanner.nextLine(); 
		
		System.out.print("3. 전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		
		//위의 내용 입력 하면 아래 내용 한번에 출력 됨
		System.out.println("[ 입력된 내용 ]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 주민번호 앞 6자리: " + num);
		System.out.println("3. 전화번호: " + tel);
	}

}

/*기본타입의 값 비교와 문자열 비교
 * 기본타입 비교: == _ 객체의 주소 비교
 * 문자열 비교: equals()메소드_ 객체의 주소값이 아닌 "문자의 열"을 비교*/
