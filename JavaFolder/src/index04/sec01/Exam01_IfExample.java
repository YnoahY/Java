package index04.sec01;

public class Exam01_IfExample {

	public static void main(String[] args) {
		/*if��: ���ǽ� ���(true, false)�� ���� ��� ���๮ ����
		 * ���� ���: true, false�� �����ϴ� �����, boolean Ÿ�� ����
		 * ���ǽ��� true�϶� �߰�ȣ ��� ���� */
		
		int score = 93;
		
		if(score>=90) {
			System.out.println("������ 90 �̻�");
			System.out.println("���: A");
		}
		
		if(score< 90) {
			System.out.println("������ 90 �̸�");
			System.out.println("���: B");
		}

	}

}
