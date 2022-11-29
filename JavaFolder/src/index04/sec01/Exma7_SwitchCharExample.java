package index04.sec01;

public class Exma7_SwitchCharExample {

	public static void main(String[] args) {
		//char형 case문 
		/*case 여러 경우를 하나로 묶어 출력 가능*/
		char grade = '8';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원");
		case 'B':
		case 'b':
			System.out.println("일반회원");
		default:
			System.out.println("손님");
		}

	}

}

