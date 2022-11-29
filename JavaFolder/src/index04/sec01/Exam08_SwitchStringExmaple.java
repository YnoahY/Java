package index04.sec01;

public class Exam08_SwitchStringExmaple {

	public static void main(String[] args) {
		//case문 String 예제
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
			default:
				System.out.println("300만원");
			}

	}

}

/* break로 분기점 꼭 만들어주기
 * default는 분기점 없어도 됨*/