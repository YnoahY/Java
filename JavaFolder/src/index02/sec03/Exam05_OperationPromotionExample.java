package index02.sec03;

public class Exam05_OperationPromotionExample {

	public static void main(String[] args) {
		//�Ǽ� ����� �ڵ� ����ȯ
		
		byte bValue1 = 10;
		byte bValue2 = 20;
		//byte bValue3 = bValue1 + bValue2; �� �����Ͽ���
		/* ������ ����Ŀ� ��� �Ǿ� �ڵ����� int������ ��ȯ�Ǿ� byte�� ������ �������� �Ѿ� ������ ���� */
		int iValue1 = bValue1 + bValue2;
		System.out.println(iValue1);
		
		
		char cValue1 = 'A';
		char cValue2 = 1;
		// char cValue3 = cValue1 + cValue2; �� �����Ͽ���, ���� ���� ����
		System.out.println("�����ڵ�: " + cValue1);
		System.out.println("���¹���: " + (char) cValue2);
		
		
		int iValue3 = 10;
		int iValue4 = iValue3/4;
		System.out.println(iValue4);
		
		
		int iValue5 = 10;
		//int iValue6 = 10/ 4.0; �� �����Ͽ���
		/* int�� ������, 4.0�� �Ǽ����̹Ƿ� int�� ��� ������ �Ѿ� ������ ����*/
		double dValue1 = iValue5/ 4.0;
		System.out.println(dValue1);
		
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		/* * �Ǽ� ����� �������� �Ǽ� �������� ��ȯ �� ���� or �и� �� �ϳ� (double)�� ����
		 
		 * double result = x/ y; �� ���:
		 * ������ ���� ����� �����̱� ������ x/y�� �Ǽ� ǥ���� ���ϰ� 0�� ��ȯ
		 */
		System.out.println((result));

	}

}
