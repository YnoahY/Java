package index02.sec03;

public class Exam06_StringConcatExample {

	public static void main(String[] args) {
		/*+ ���꿡���� ���ڿ� �ڵ� Ÿ�� ��ȯ
		 * �ǿ����ڰ� ��� ������ ��� ���� ����: �������
		 * �ǿ����� �� �ϳ��� ���ڿ� �� �� �������� ���ڿ��� �ڵ� ��ȯ, ���� ����: ���Ῥ��*/
		
		//���� ����
		int Value = 10 + 2 + 8;
		System.out.println("Value : " + Value);
		
		//���տ���
		/* ����+����=�������, ����+����, ����+����=���Ῥ�� 
		 * ���� �ڿ�, ���� ���̿� ���ڿ� ���� ������ ��ü�� ���ڿ� ���*/
		
		//10+2�� ������� +8�� ���� ����
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);
		//��ü ���ڿ�
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);
		//��ü ���ڿ�
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);
		//��ȣ ���� �ÿ� ��ȣ ���� ó��
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4);

	}

}
