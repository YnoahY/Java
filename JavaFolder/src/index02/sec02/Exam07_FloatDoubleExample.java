package index02.sec02;

public class Exam07_FloatDoubleExample {

	public static void main(String[] args) {
		/*실수타입: float, double
		 * 소수점이 있는 리터럴은 10진수 실수로 인식
		 * e,E 포함된 숫자 리터럴은 지수 및 가수로 표현된, 소수점 있는 10빈수 실수로 인식
		 * 자바는 double을 기본 타입으로 해석
		 *  *실수는 접미사 구분이 중요*
		 */
		
		/*flot
		 * 저장은 2진수로도 됨
		 * 10진수로 환산해서 소수 6~9자리까지 지원하나 안되는 경우 있음.
		 * 6자리로 생각해야함. 6자리 이상은 double형 사용
		 */
		
		
		double var1 = 3.14; //float 사용시 → 컴파일 에러(type mismatch)		
		float var2 = 3.14f; //리터럴 뒤 f,F 붙여 float타입 표시
		double var3= 3.14; //double타입이 float타입 보다 2배가량 정밀도가 높음 → 정확한 데이터 저장 가능
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f; /*7자리에서 반올림됨, 
		                                       15자리 이상되는 데이터를 작은 곳에 넣으면 무리 생김, 그래서 접미사f로 적은 숫자라는것 표시*/
		double var5 = 0.1234567890123456789; //15자리 까지만 지원, 그 이상시 숫자가 5이상이면 올림 아니면 내림
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		

	}

}
