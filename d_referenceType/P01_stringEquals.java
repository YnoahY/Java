package d_referenceType;

public class P01_stringEquals {

	public static void main(String[] args) {
		/*.equals(): 주소가 가리키고 있는 데이터 값 비교(오로지 값을 비교)
		 * == : stack의 value값 비교(기본 타입이든 객체 타입이든 stack의 value값을 비교)
		 * */
		
		
		String strVar1 = "최수빈";
		String strVar2 = "최수빈";
		
		if(strVar1 == strVar2) { //값 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { //값 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("최수빈"); //new로 객체생성 -> 각각 주소지 생성
		String strVar4 = new String("최수빈");
		
		if(strVar3 == strVar4) { //주소지 비교
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) { //heap영역 안의 값 비교
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}

	}

}
