package index04.sec02;

public class Exam07_WhileSumFormlTo10Example {

	public static void main(String[] args) {
		//1~100���� ���� �հ�
		int sum = 0; //�հ� ���� ���� ����
		int i = 1; // ���� ����
		
		while(i<=100) /*����*/{
			sum+=i; /*����=����+�ǿ�����*/
			i++; //��������
		}
		System.out.println("1~" + (i-1) + "������ ��: " + sum);

	}

}
