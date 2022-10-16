package a_intro;

public class P10_casting {

	public static void main(String[] args) {
		//강제 형변환 = 캐스팅 = 네로잉 = 축소 = 값손실 일어남
		//선변환 후대입
		int intValue = 44032;
		char charValue = (char) intValue;//char의 범위를 넘기지 않아서 값손실 없음
		System.out.println(charValue);
		//char 보다 큰 범위, int 범위 내에 있는 값을 캐스팅 했을 때 값 손실 생김
		//char의 범위 만큼만 변수에 대입, char의 범위를 넘으면 값 버림 = 값손실
		//char의 범위 : 2^16
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		//long< x >int : x =>값손실 남
		//
		
		//값손실
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		intValue = 10000000;
	    charValue = (char) intValue;
	    System.out.println(charValue);

	}

}
//컴퓨터는 정수를 무조건 기본타입인 int, 실수는 double로 인식함
//정수의 경우 int보다 작은 타입은 자동으로 프로모션해서 int로 인식함
//int 보다 큰 long은 컴퓨터가 알 수 있도록 맨뒤에 L표기
