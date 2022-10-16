package a_intro;

public class P11_ByteOperation {

	public static void main(String[] args) {
		byte result1 = 10 + 20; //타입이 없는 값일 뿐이라서 byte 대입 가능
		System.out.println(result1);
		
		//형변환 일어남
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
	}

}
