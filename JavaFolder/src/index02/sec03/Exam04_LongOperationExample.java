package index02.sec03;

public class Exam04_LongOperationExample {

	public static void main(String[] args) {
		//���� ���� �� �ڵ� Ÿ�� ��ȯ
		
		/* ���� �⺻���� int���� �� ū���� ���� ���, �� ū ������ �ڵ� Ÿ�� ��ȯ �� */
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L; 
		/* long�� ǥ���� �׻� ���� 'L' �ٿ���� �� 
		 * �ҹ��� 'l'�� �ƴ� �빮�� ��� �� ���� 1�� ȥ����*/
		long result = value1 + value2 + value3;
		System.out.println(result);

	}

}
