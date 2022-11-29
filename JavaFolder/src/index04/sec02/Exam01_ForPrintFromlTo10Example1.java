package index04.sec02;

public class Exam01_ForPrintFromlTo10Example1 {

	public static void main(String[] args) {
		//1~10까지 총합		
		int sum = 0; //합계를 지정해 줄 변수 선언

		int i =0; //(i-1)부분때문에 선언해줌
		for(i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + "까지의 합: " + sum);

	}

}

/* ("1~" + (i-1) + "합: " + sum);
 * (i-1): for구문의 실행은 조건완료인 10까지 되는것이 아니라
          10이 지나고 11회차 실행때 조건식이 false가 되어 구문 종료 되므로 -1처리 해주어야 함.*/


