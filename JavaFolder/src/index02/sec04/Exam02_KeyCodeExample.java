package index02.sec04;

public class Exam02_KeyCodeExample {

	public static void main(String[] args) throws Exception {
		/*System.in.(): 시스템의 표준 입력 장치에서 읽음
		 * System.in.read(): 키보드에서 키를 입력할 때 프로그램에서 숫자로 된 키코드 읽음
		 * 					: 얻은 키코드는 대입연산자를 이용하여 int 변수에 저장
		 * 단점: 2개 이상 조합된 키, 통문자열 못읽음
		 * 	→ Scanner로 해결 가능: 입력된 통 문자열 읽기 가능*/
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keycode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keycode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keycode: " + keyCode);

	} /*Enter는 키코드의 값: 2개
	 	: (1)아래로 내려온 후 (2)내려간 행의 맨 앞으로 이동 → 2개 값
	 	* 다음행 - 13, 맨 앞으로 이동-10*/
}
