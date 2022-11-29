package index02.sec02;

public class Exam05_StringExample {

	public static void main(String[] args) {
		/*문자열
		 * 큰따옴표로 감싼 문자"들"
		 * char 타입에 저장 불가
		 * String: 문자열은 String타입 변수에 저장 가능
		 */
		String name/*참조형*/ = "도도새";
		String phylum = "척삭동물";
		String order = "비둘기";
		
		System.out.println(name);
		System.out.println(phylum);
		System.out.println(order);
		
		//한글지원: 유니코드
		//한글: 2~3byte, 영문 1byte

	}

}
