package index04.sec01;

public class Exam03_IfElseIfElseExample {

	public static void main(String[] args) {
		/* if else if else문 : 조건식이 여러개
		 * 처음 if문의 조건식이 false일 경우 다른 조건식의 결과에 따라 실행 블록 선택
		 * if(l)이 false → else if(2)에서 재검토 후 진행
		 * 첫 if구문에서 true면 {}실 실행, false면 다음 else if구문으로 가서 재검토 후 if면 {}실행, false면 else로
		 
		 * 인자값이 if안의 조건에 맞으면 {}안의 구문 실행 
		 * if(){} else if(){} else{}
		 * else에는 조건 필요x 위에 해당하는 조건이 아닌 값이 else기 때문 */
		
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수: 100~90");
			System.out.println("등급: A");
		} else if(score>=80) {
			System.out.println("점수: 80~89");
			System.out.println("등급: B");	
		} else if(score>=70) {
			System.out.println("점수: 70~79");
			System.out.println("등급: c");
		} else { 
			System.out.println("점수: 60이하");
			System.out.println("등급: D");
		}

	}

}
