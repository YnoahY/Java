package index02.sec01;

public class Exam04_VariableScopeExample {

	public static void main(String[] args) {
		
		/*로컬 변수 : 
		 * 중괄호로 묶인 메소드 블록 내에 선언된 변수
		 * 메소드 블록 내에서만 사용 되고 메소드 실행 종료 후 자동 삭제 → 해당 블록 내에서만 사용 가능
		 * 메인메소드 안에서 선언한 변수는 그 안의 블록에서도 사용 가능
		 */
		int v1 = 12;
		
		if(v1>10) {
			int v2;
			v2 = v1 - 5;
		} //if 블록
		
		int v3 = v1 + 7 -5;	
		
		System.out.println(v3);

	}

}

