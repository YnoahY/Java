package index02.sec01;

public class Exam03_VariableExchangeExample {
	public static void main(String[] args) {
		
		//변수 값 복사: 변수의 값을 다른 변수에 저장
		int x = 8; //변수 x에 8의 주소 저장
		int y = 5; //변수 y에 5의 주소 저장
		System.out.println("x:" + x + ", y:" + y);
		System.out.println("---------------------------------------");
		
		//x와 y의 값을 서로 교환 할(바꿀)때 "temp" 사용
		int temp = x; //x값 → temp에 저장
		x = y; // 변수y값 → 변수x에 저장
		y = temp; //temp에 저장되어 있던 변수x값 → 변수y저장
		
		System.out.println("x:" + x + ", y:" + y);
	}

}
