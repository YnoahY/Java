package index02.sec02;

public class Exam01_InterLiteralExample {

	public static void main(String[] args) {
		/*자바 언어 기본타입
		 * 정수: byte(1byte), short(2byte), int(4byte/기본), long(8byte)
		 * 실수: float(소수점이하6자리), double(소수점이하 15자리/기본)
		 * 논리:boolean(참,거짓/1,0)
		 * 문자: char(2byte, 전부 양수)
		 */

		
		//**정수타입**
		
		
		//리터럴: 소스코드에서 프로그래머가 직접 입력 한 값
		 
		/* 정수로 인식
		 * 2진수: 0b, 0B로 시작/ 0과 1로 구성
		 * 8진수: 0으로 시작/ 0~7로 구성, 8자리일때 올림
		 * 10진수: 소수점 없는 0~9로 구성, 인간최적화, 10이 되면 자리올림
		 * 16진수: 0x, 0X로 시작/ 0~9와 (10~16대신)A~F, a~f로 구성, 16자리일때 올림
		 */
		
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		

	}

}
