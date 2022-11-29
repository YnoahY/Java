package index04.sec01;

public class Exam06_SwitchNoBreakExample {

	public static void main(String[] args) {
		/*8 <= 난수 < 12: 4+8 사이의 정수 얻기
		 * 0.9 * 4 = 3.6 + 8 = 11
		 * 0~11 까지의 수 랜덤하게 얻기*/
		int time = (int)(Math.random()*4) + 8;
		System.out.println("현재시간: " + time + " 시");
		
		switch(time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10: 
			System.out.println("업무");
		default :
			System.out.println("외근");
		}

	}

}


