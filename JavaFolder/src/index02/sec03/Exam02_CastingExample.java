package index02.sec03;

public class Exam02_CastingExample {

	public static void main(String[] args) {
		/*����Ÿ�Ժ�ȯ: ū �������� Ÿ���� ���� ��� ���� Ÿ������ ������ ������ �� ������ ����
		 * () : ĳ���� ������ ���, ��ȣ ���� ������ ����
		 */
		int intValue = 44032; //int: 4byte
		char charValue = (char) intValue; //char: 2byte
		System.out.println(charValue);
		
		long longValue = 500; //8byte
		intValue = (int) longValue; //2byte
		System.out.println(intValue);
		
		double doubleValue = 3.14; //8byte
		intValue = (int) doubleValue; //�� int�� �����κ��� 3������
		System.out.println(intValue);
	}

}
