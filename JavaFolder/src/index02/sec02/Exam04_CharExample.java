   package index02.sec02;

public class Exam04_CharExample {

	public static void main(String[] args) {
		/*char 
		 * �ϳ��� ���ڸ� ����
		 * ���� ����ǥ�� ���� ���� ���ͷ� �� �����ڵ�� ��ȯ �Ǿ� ����
		 * ����Ÿ�� �� 10����, 16���� ������ �����ڵ�� ���� ���� 
		 */
		
		char c1 = 'A'; //����
		char c2 = 65; //10����
		char c3 = '\u0041'; //16����
		
		char c4 = '��'; //����
		char c5 = 44032; //10����
		char c6 = '\uac00'; //16����, �ϳ��� ���� ���
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

	}

}
