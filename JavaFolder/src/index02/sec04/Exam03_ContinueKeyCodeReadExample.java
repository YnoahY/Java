package index02.sec04;

public class Exam03_ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		//키보드로 문자 입력후 엔터 → 해당 문자의 keycode값+엔터값
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}

	}

}
