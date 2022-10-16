package a_intro;

public class P02_variableScope {

	public static void main(String[] args) {
		//전역 변수
		int v1 = 15; 
		int v2 = 0;
		
		if(v1>10) {
			//지역변수
			// int v2; -> 지역 변수기 때문에 중문 밖의 v2에 오류 발생
			// 해결 : v2를 전역변수로 선언
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}
}
		
