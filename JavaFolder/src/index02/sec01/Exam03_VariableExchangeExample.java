package index02.sec01;

public class Exam03_VariableExchangeExample {
	public static void main(String[] args) {
		
		//���� �� ����: ������ ���� �ٸ� ������ ����
		int x = 8; //���� x�� 8�� �ּ� ����
		int y = 5; //���� y�� 5�� �ּ� ����
		System.out.println("x:" + x + ", y:" + y);
		System.out.println("---------------------------------------");
		
		//x�� y�� ���� ���� ��ȯ ��(�ٲ�)�� "temp" ���
		int temp = x; //x�� �� temp�� ����
		x = y; // ����y�� �� ����x�� ����
		y = temp; //temp�� ����Ǿ� �ִ� ����x�� �� ����y����
		
		System.out.println("x:" + x + ", y:" + y);
	}

}
