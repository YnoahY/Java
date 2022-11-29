package index04.sec02;

public class Exam06_WhilePrintFormlTo10Example {

	public static void main(String[] args) {
		/*while문: 
		 * 임의 횟수 반복(실무에서는 본인이 사용하고 싶은대로 사용)
		 * 초기문, 조건, 증감 필요
		 * true: 계속 반복/ false: 종료
		 * 조건식: 비교연산식, 논리연산식*/

		//1~10까지 출력
		int i = 1; //초기화
		while(i<=10) /*조건*/{
			System.out.println(i);
			i++; //후위 증가
		}

	}

}

