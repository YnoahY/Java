package a_intro;

public class P12_longOperation {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; //int+int+long => 가장 큰 타입을 따라감, 일종의 프로모션
		System.out.println(result);
	}
}
