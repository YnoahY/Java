package index02.sec03;

public class Exam03_ByteOperationExample {

	public static void main(String[] args) {
		//���� ����� �ڵ� Ÿ�� ��ȯ
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		/* int + byte = int�� ����ȯ 
		 * short + short = int�� ����ȯ
		 
		 * int���� ������ ������ ������ int������ �ڵ� Ÿ�� ��ȯ��
		 */
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);

	}

}
