package index02.sec04;

public class Exam02_KeyCodeExample {

	public static void main(String[] args) throws Exception {
		/*System.in.(): �ý����� ǥ�� �Է� ��ġ���� ����
		 * System.in.read(): Ű���忡�� Ű�� �Է��� �� ���α׷����� ���ڷ� �� Ű�ڵ� ����
		 * 					: ���� Ű�ڵ�� ���Կ����ڸ� �̿��Ͽ� int ������ ����
		 * ����: 2�� �̻� ���յ� Ű, �빮�ڿ� ������
		 * 	�� Scanner�� �ذ� ����: �Էµ� �� ���ڿ� �б� ����*/
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keycode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keycode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keycode: " + keyCode);

	} /*Enter�� Ű�ڵ��� ��: 2��
	 	: (1)�Ʒ��� ������ �� (2)������ ���� �� ������ �̵� �� 2�� ��
	 	* ������ - 13, �� ������ �̵�-10*/
}
