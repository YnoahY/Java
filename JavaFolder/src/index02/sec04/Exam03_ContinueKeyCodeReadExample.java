package index02.sec04;

public class Exam03_ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		//Ű����� ���� �Է��� ���� �� �ش� ������ keycode��+���Ͱ�
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}

	}

}
