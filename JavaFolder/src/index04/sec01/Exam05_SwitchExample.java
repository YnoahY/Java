package index04.sec01;

public class Exam05_SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		default :
			System.out.println(6);
			break;
		}
	
	}
}

/* break 
 * switch구문 빠져나옴
 * break 없을 시 순차적으로 전부 출력
 * 분기점을 선택 할 수 없으면*/
 