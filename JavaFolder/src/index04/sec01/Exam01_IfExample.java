package index04.sec01;

public class Exam01_IfExample {

	public static void main(String[] args) {
		/*if문: 조건식 결과(true, false)에 따라 블록 실행문 결정
		 * 수용 요소: true, false값 산출하는 연산식, boolean 타입 변수
		 * 조건식이 true일때 중괄호 블록 실행 */
		
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90 이상");
			System.out.println("등급: A");
		}
		
		if(score< 90) {
			System.out.println("점수가 90 미만");
			System.out.println("등급: B");
		}

	}

}
