package a_intro;

public class P17_keyCode {

	public static void main(String[] args) throws Exception {
		//system.in : 입력장치에서 읽기
		//system.out : 입력장치에서 출력
		/*keyCode
		 * enter : CR(맨 앞줄로 이동, 13), LF(다음줄로 이동, 10), 값 2개 */
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

	}

}
