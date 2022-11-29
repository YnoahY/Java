package index02.sec02;

public class Exam06_EscapeExample {

	public static void main(String[] args) {
		/*이스케이프문자: 정수타입
		 * 문자열 내부의 \를 뜻함
		 * 특정문자 포함, 문자열 출력 제어
		 */
		System.out.println("번호\t이름\t직업"); //tap만큼 띄움
		System.out.println("행 단위 출력\n"); //줄바꿈(라인 피드)
		System.out.println("이것은\r캐리지리턴\n"); //캐리지리턴, 줄바꿈
		System.out.println("행 단위 출력\n"); 
		System.out.println("\"우리\"는 \'개\'\'발\'\'자\' 입니다."); //"출력, '출력
		System.out.println("봄\\여름\\가을\\겨울"); // \출력

	}

}
