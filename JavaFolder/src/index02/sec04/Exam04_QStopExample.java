package index02.sec04;

public class Exam04_QStopExample {

	public static void main(String[] args) throws Exception {
		//keycode값이 113(=q)일때 구문 종료
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keycode: " + keyCode);
			
			if(keyCode == 113) {
				break; //keycode가 113과 동일할 경우 실행
			}
		}
		
		System.out.println("종료");

	}

}
