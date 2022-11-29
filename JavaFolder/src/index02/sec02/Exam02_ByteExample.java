package index02.sec02;

public class Exam02_ByteExample {

	public static void main(String[] args) {
		//허용범위 초과시 컴파일 에러
		byte a = -128; //-128~-1
		byte b = -30;
		byte c = 0;
		byte d = 30;
		byte e = 127; // 0~127, 0도 양수 취급
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
