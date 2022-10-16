package a_intro;

public class P07_floatDouble1 {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14;
		//실수의 기본값 : double
		//오류 수정 3가지: 타입을 double로 수정, 3.14f로 수정, 강제 캐스팅
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트 - double이 float에 비해서 더 정밀함
		float var4 = 0.1234568791234568f; //소수점 11자리 까지 지원, 8자리에서 반올림해서 7자리까지 나옴
		double var5 = 0.1234567891246478; //소수점 16자리 까지만 지원
		//float도 double도 각자의 자릿수를 초과한 실수를 넣으면 범위 초과로 에러
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e = *10
		double var6 = 3e6; //3*10^6
		float var7 = 3e6F; //3*10^6f
		double var8 = 2e-3; //2*10^-3
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);

	}

}
