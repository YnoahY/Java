package index02.sec04;

import java.util.*;

public class Exam05_ScannerExample {

	public static void main(String[] args) throws Exception{
		//입력된 "문자열" 출력 중 q의 값을 만나면 구문 종료, !keycod아님!
		Scanner scanner = new Scanner(System.in); //new로 system.in에서 Scanner호출 → Scanner형의 scanner 변수에 객체 저장
		String inputData; //string형의 변수 선언
		
		while(true) { //무한 참
			inputData = scanner.nextLine(); // 엔터키 치기 전까지 입력한 을 읽어 들임
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) { //.equals(): .앞의 변수값과 ()안의 능력값이 동일할때 true를 반환
				break; //가장 가까운 반복문을 빠져나오는 예약어

			}
		}
		System.out.println("종료");

	}

}

/*nextLine() 메소드
 * 엔터키 치기 전까지 입력한 을 읽어 들임
 * 문자열만 반환*/