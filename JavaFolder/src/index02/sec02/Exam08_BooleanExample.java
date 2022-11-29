package index02.sec02;

public class Exam08_BooleanExample {

	public static void main(String[] args) {
		/* 논리타입
		 * 참(1),거짓(0)에 해당하는 true,false리터럴을 저장
		 * 두가지 상태값에 따라 제어문의 실행흐름을 변경하는데 사용
		 */
		boolean stop = true; //if(stop)이 참이면 if구문 안으로 들어가 실행
		if(stop) {
			System.out.println("중지");
		} else {
			System.out.println("시작");
		}
		
		boolean stop1 = false; //if는 참만 받아서 stop1의 값이 false기 때문에 else구문으로 실행됨
		if(stop1) {
			System.out.println("중지");
		} else {
			System.out.println("시작");
		}


	}

}
