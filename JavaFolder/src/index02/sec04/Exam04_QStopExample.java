package index02.sec04;

public class Exam04_QStopExample {

	public static void main(String[] args) throws Exception {
		//keycode���� 113(=q)�϶� ���� ����
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keycode: " + keyCode);
			
			if(keyCode == 113) {
				break; //keycode�� 113�� ������ ��� ����
			}
		}
		
		System.out.println("����");

	}

}
