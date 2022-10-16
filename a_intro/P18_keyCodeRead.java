package a_intro;

public class P18_keyCodeRead {

	public static void main(String[] args) throws Exception{
		/*반복문
		 * while(조건식): 조건식이 참일때 {} 실행 -> false가 될 때까지 반복 : true 일 때 무한 반복/ false일때
		 * 시작 안함 for(조건식): 조건식이 참일때 {} 실행 -> 시작과 종료가 정해져있음(초기값, 조건(종료값), 증감식)
		 * doWhile(조건식) : 1회 필수 실행 후 while문과 동일 하게 실행 */
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keycode: " + keyCode);
		}
		
	}

}
