package index04.sec01;

public class Exam02_IfElseExample {

	public static void main(String[] args) {
		/* if-else문: 조건식 결과에 따라 실행 블록 선택
		 * true → if {}블록 실행
		 * false → else {}블록 실행*/
		
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수 90 이상");
			System.out.println("등급: A");
		} else {
			System.out.println("점수가 90 미만");
			System.out.println("등급: B");
		}

	}

}
